class First extends Thread{
  Second s;
  public First(Second s){
    this.s = s;
  } 
  public void run(){
    try{
      System.out.println("First is execution...");
      s.start();
      s.join();// At this poinst first thread is stopped..
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
      }
    }
    catch(Exception e){
    
    }  
  }
}
class Second extends Thread{
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
    
    Second s = new Second();
    First f1 = new First(s);
    
    f1.setName("First Thread...");
    s.setName("Second Thread...");
    
    f1.start();
    
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




