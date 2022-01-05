interface I{
  class A{
    public void m1(){
      System.out.println("m1-called...");
    }
  }
}
class Test extends I.A{
  
}
class TestMain{
  public static void main(String arg[]){
     I.A obj = new Test();
     obj.m1();
  }
}




