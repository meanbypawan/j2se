class TestMain{
  public static void main(String arg[]){
    Runnable r1 = ()->{
      try{
        for(int i=1; i<=5; i++){
          System.out.println("Thread-1");
          Thread.sleep(1000);
        }
      }
      catch(Exception e){
      
      }
    };
    Runnable r2 = ()->{
      try{
        for(int i=1; i<=5; i++){
          System.out.println("Thread-2");
          Thread.sleep(700);
        }
      }
      catch(Exception e){
      
      }
    };
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    
    t1.start();
    t2.start();     
  }
}




