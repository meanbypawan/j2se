class Task{
  public void m1(int start, int end){
    try{
      for(;start<=end; start++){
        System.out.println(start);
        Thread.sleep(1000);
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }  
  }
}
class PrintNumber extends Thread{
  Task task;
  public PrintNumber(Task task){
    this.task = task;
  }
  public void run(){
    task.m1(1,10);
  }
}
class TestMain{
  public static void main(String arg[]){
    Task task = new Task();
    PrintNumber pt = new PrintNumber(task);
    pt.start(); // run()
    int c = 10/0;
    System.out.println("At the end....");
  }
}







