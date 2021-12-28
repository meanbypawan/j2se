class A{
  public static void m1(){
    System.out.println("M-1 in A");
  }
}
class B extends A{
  public static void m1(){
    System.out.println("M-1 in B");
  }
}
class TestMain{
  public static void main(String arg[]){
    A obj = new B();
    obj.m1();
  }
}
