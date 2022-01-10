/* Multithreading :- Executing multiple task simultaneously
  where each task is seperate independent part of 
  same program.
  Why : - To improve the performance of application
  
  How many ways to implement multithrading :- Two way of
  implementing mutithreading
   1) By extending thread class
   2) By implementing runnable interface
  
  How to assign the job to thread
   Ans :- by overriding run method
  What is run method :- Run method is job executed by thread
  
  Thread states :- New/Born
                   Runnable
                   Running
                   Waiting
                   Terminate    
*/  
class FirstThread extends Thread{
  public void run(){
    for(int i=1; i<=5; i++){
      System.out.println("Cheeku... ");
    } 
  }
}
class SecondThread extends Thread{
  public void run(){
    for(int i=1; i<=5; i++)
      System.out.println("Peeku.....");
  }
}
class TestMain{
  public static void main(String arg[]){
    FirstThread t1 = new FirstThread();
    SecondThread t2 = new SecondThread();
    
    t1.start(); // run()
    t2.start(); // run()
  }
}















