class First extends Thread{
  First f2,f3;
  public First(){}
  public First(First f2, First f3){
    this.f2 = f2;
    this.f3 = f3;
  }
  public void run(){
    try{
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
      }
      f2.start();
      f3.start();
    }
    catch(Exception e){
    
    }  
  }
}
class TestMain{
  public static void main(String arg[]){
    System.out.println("Main started...");
    First f2 = new First();
    First f3 = new First();
    First f1 = new First(f2,f3);
    
    f1.setName("F1 Thread...");
    f2.setName("F2 Thread...");
    f3.setName("F3 Thread...");
  
    f1.start(); // run()
    
    try{
      for(int i=1; i<=5; i++){
        System.out.println("Main Thread....");
        Thread.sleep(700);
      }
    }
    catch(Exception e){
    
    }  
    System.out.println("Main finished.....");
  }
}




