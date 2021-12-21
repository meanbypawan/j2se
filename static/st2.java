class Test{
  public static void m1(){
    System.out.println("m1-called...");
  }
  
}
class TestMain{
  public static void main(String arg[]){
     new Test().m1();
     Test.m1();
     m1();
  }
  
}
