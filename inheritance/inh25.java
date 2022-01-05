class A{
  public void m1(){
    System.out.println("m1-called in A");
  }
  class B{
    public void m2(){
      System.out.println("m2-called in B");
    }
  }
}
class Child extends A{

}
class TestMain{
   public static void main(String arg[]){
     Child obj = new Child();   
     obj.m1();
     Child.B obj2 = obj.new B();
     obj2.m2();
   }
}

