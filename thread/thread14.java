class Task{
  synchronized public void producingData(){
   try{
      System.out.println("Producer got lock and producing data..");
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName()+" producing data..");
        Thread.sleep(3000);
      }
      System.out.println("Data produced....");
      notify();
    }
    catch(Exception e){
      e.printStackTrace();    
    }
  }
  synchronized public void consumingData(){
    try{
      System.out.println("Consumer get lock and executing..");   
      System.out.println("Consumer released the lock");
      wait();
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName()+" consuming data..");
        Thread.sleep(3000);
      }
    }
    catch(Exception e){
      e.printStackTrace();    
    }
  }
}
class Producer extends Thread{
  Task task;
  public Producer(Task task){
    this.task = task;
  }
  public void run(){
    task.producingData();
  }
}
class Consumer extends Thread{
  Task task;
  public Consumer(Task task){
    this.task = task;
  }
  public void run(){
    task.consumingData();
  }
}
class TestMain{
  public static void main(String argg[]){
   try{ 
    Task task = new Task();
    Producer p1 = new Producer(task);// p1--> task(proData())
    Consumer c1 = new Consumer(task);//c1->task(consData())
    
    p1.setName("Producer.");
    c1.setName("Consumer.");
    
    c1.start();
    c1.join(2000);
    p1.start();
   }
   catch(Exception e){
     e.printStackTrace();
   }
  }
}








