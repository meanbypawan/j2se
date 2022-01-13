class Task{
  public void m1(){
    try{
      synchronized(this){
        for(int i=1; i<=5; i++){
          System.out.println(Thread.currentThread().getName()+" in sync block");
          Thread.sleep(2000);
        }
      }
      for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName()+" outside block");
        Thread.sleep(3300);
      }
    }
    catch(Exception e){
    
    }
  }
}
class TestMain{
  public static void main(String... arg){
     Task task = new Task();
     Runnable r1 = ()->{
       task.m1();
     };
     Runnable r2 = ()->{
       task.m1();
     };  
     Runnable r3 = ()->{
       task.m1();
     };
     Thread t1 = new Thread(r1);
     Thread t2 = new Thread(r2);
     Thread t3 = new Thread(r3);
     
     t1.setName("T1..");
     t2.setName("T2..");
     t3.setName("T3..");
     
     t1.start();
     t2.start();
     t3.start();
  }
}










