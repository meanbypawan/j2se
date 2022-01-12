class First extends Thread{
  public void run(){
    System.out.println("First executed....");
    new Second().start();
  }
}
class Second extends Thread{
  public void run(){
    System.out.println("Second executed...");
    System.out.println("Second Thread : "+
    Thread.currentThread().getPriority());
  }
}
class TestMain{
  public static void main(String arg[]){
    Thread mainThread = Thread.currentThread();
    mainThread.setPriority(Thread.MAX_PRIORITY);
    System.out.println("Parent Thread : "+mainThread.getPriority());
    
    First f = new First();
    f.setPriority(3);
    System.out.println("Child Thread:  "+f.getPriority());
    f.start();
    f.start();
  }
}





