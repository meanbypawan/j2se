class First extends Thread{
  public void run(){
   try{
     for(int i=1; i<=5; i++){
       System.out.println("First Thread.....");
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
       System.out.println("Second Thread.....");
       Thread.sleep(700);
     }
   }
   catch(Exception e){
   
   }
  }
}
class TestMain{
  public static void main(String arg[]){
    try{ 
     First f = new First();
     Second s = new Second();
     /*
       Thread.MIN_PRIORITY :-1
       Thread.MAX_PRIORITY :-10
       Thread.NORM_PRIORITY:-5
     */
     f.setPriority(Thread.MIN_PRIORITY); 
     s.setPriority(Thread.MAX_PRIORITY);
      
     f.start(); 
     s.start();
     
     for(int i=1; i<=5; i++){
       System.out.println("Main Thread.....");
       Thread.sleep(400);
     }
    }
    catch(Exception e){
       e.printStackTrace();
    } 
  }
}








