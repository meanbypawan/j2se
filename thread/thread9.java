class First extends Thread{
  public void run(){
    try{
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName());
        Thread.yield();
        
      }
      System.out.println("First Thread end....");
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
class TestMain{
  public static void main(String args[]){
   try{ 
    Thread.currentThread().setPriority(10); 
    First f = new First();
    f.setName("First Thread...");
    f.setPriority(5);
    f.start();
    for(int i=1; i<=5; i++){
      System.out.println("Main Thread..");
      Thread.sleep(2000); 
    }
    
   }
   catch(Exception e){
   
   } 
  }
}
