class First extends Thread{
 
  public void run(){
    try{
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
      }
    }
    catch(Exception e){
    
    }  
  }
}
class TestMain{
  public static void main(String arg[]){
   try{ 
    System.out.println("Main started...");
    First f1 = new First();
    First f2 = new First();
    
    
    f1.setName("F1 Thread...");
    f2.setName("F2 Thread...");
    
    f1.start();
    f2.start();
    
    f1.join(); // Main stopped......
    
    
    for(int i=1; i<=5; i++){
        System.out.println("Main Thread....");
        Thread.sleep(1000);
    }
   }
   catch(Exception e){
     e.printStackTrace();
   } 
   
  }
}




