class Task{
  synchronized public void m1(){
    try{
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName()+" in m1()");
        Thread.sleep(1000);
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
class First extends Thread{
  Task task;
  public First(Task task){
    this.task = task;
  }
  public void run(){
    task.m1(); 
  }
}
class Second extends Thread{
 Task task;
 public Second(Task task){
   this.task = task;
 }
 public void run(){
   task.m1();
 }
}
class TestMain{
  public static void main(String arg[]){
    Task task1 = new Task();
    Task task2 = new Task();  
    
    First t1 = new First(task1); // t1--> task1.m1()
    Second t2 = new Second(task2);// t2--> task2.m1()
     
    t1.setName("First Thread ");
    t2.setName("Second Thread ");
    
    t1.start();
    t2.start();
  }
}
