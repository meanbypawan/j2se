class First extends Thread{
  public void run(){
   
    for(int i=1; i<=5; i++){
      try{
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000); 
      }
      catch(Exception e){
       
      }
    }
  }
}
class TestMain{
  public static void main(String arg[]){
   try{  
    First t1 = new First();
    t1.setName("First Thread...");
    System.out.println("After create : "+t1.getState());
    
    t1.start(); // run()
    System.out.println("After start : "+t1.getState());
    
    System.out.println("isAlive : "+t1.isAlive());
    t1.join();// It will stopped main thread
    System.out.println("After execution : "+t1.getState());
   }
   catch(Exception e){
   
   } 
  }
}



