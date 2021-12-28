abstract class A{
  abstract public void m1();
  public void m2(){
    System.out.println("M2-in-A");
  }
}
class B extends A{
  // public abstract void m1()
  public void m1(){
    System.out.println("Now m1 is implemented....");
  }
  public String getMessage(){
    return "Hello Friends";
  }
}
class TestMain{
  public static void main(String args[]){
    A obj = new B();
    obj.m1();
    obj.m2(); 
    //System.out.println(obj.getMessage());
  }
}
