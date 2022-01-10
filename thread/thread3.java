class FirstThread extends Thread{
  // T1 and T3
  public void run(){
   try{
    for(int i=1; i<=5; i++){
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(2000);
    } 
   }
   catch(InterruptedException e){
   
   } 
  }
}
class SecondThread extends Thread{
  public void run(){
   try{ 
    for(int i=1; i<=5; i++){
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(3200);
    }  
   }
   catch(InterruptedException e){
   
   }
  }
}
class TestMain{
  public static void main(String arg[]){
    FirstThread t1 = new FirstThread();
    SecondThread t2 = new SecondThread();
    FirstThread t3 = new FirstThread();
    
    t1.setName("T1..");  
    t2.setName("T2..");
    t3.setName("T3..");
      
    t1.start(); // run()
    t2.start(); // run()
    t3.start(); // run()
    try{
      for(int i=1; i<=5; i++){
         System.out.println("Main thread....");
         Thread.sleep(5000); 
      }
    }
    catch(Exception e){
    
    }
  }
}















