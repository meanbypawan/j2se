class A{
  int x = 200;
  public void m1(){
    System.out.println("m1 of A");
  }
  class B{
    public void m2(){
      System.out.println("m2 of B");
      System.out.println("x : "+x);
      m1();
    }
  }
}
class TestMain{
  public static void main(String arg[]){
    A obj = new A();
    obj.m1();
  
    A.B obj2 =  obj.new B();
    obj2.m2();
  }
}









