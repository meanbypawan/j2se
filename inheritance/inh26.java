class A{
  public A(){
    System.out.println("A-default....");
  }
  public void m1(){
    System.out.println("m1-called in A");
  }
  class B{
    public B(){
      System.out.println("B-default...");
    }
    public void m2(){
      System.out.println("m2-called in B");
    }
  }
}
class Child extends A.B{
  public Child(){
    new A().super();
    System.out.println("Child Constructor called..");
  } 
}
class TestMain{
   
   public static void main(String arg[]){
     Child obj = new Child();   
     obj.m2();
   }
}

