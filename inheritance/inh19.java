class A{
  public void m1(){
    System.out.println("m1-called..in A");
  }
}
class B extends A{
  public void m1(){
    System.out.println("m1-called in B");
    super.m1(); 
  }
}
class TestMain{
  public static void main(String ar[]){
     A obj = new B();
     obj.m1();
  }
}
