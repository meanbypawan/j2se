class Task{
  public int m1(int start, int end){
    try{
      for(;start<=end; start++){
        System.out.println(start);
        Thread.sleep(1000);
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }  
    return 100;
  }
}
class PrintNumber extends Thread{
  Task task;
  public PrintNumber(Task task){
    this.task = task;
  }
  public void run(){
    System.out.println(task.m1(1,10));
  }
}
class TestMain{
  public static void main(String arg[]){
   try{ 
    Task task = new Task();
    PrintNumber pt = new PrintNumber(task);// pt-->task
    pt.start(); // run()
    
    for(int i=1; i<=5; i++){
      System.out.println("Main executing.....");
      Thread.sleep(600);
    }
   }
   catch(Exception e){
   
   } 
  }
}







