interface I1{
  default void m1(){
    System.out.println("M1 of I1");
  }
}
interface I2{
  default void m1(){
    System.out.println("M1 of I2");
  }
}
class C implements I1,I2{
  public void m1(){
    System.out.println("M1 Of C");
  }
}
class TestMain{
  public static void main(String args[]){
     C obj = new C();
     obj.m1();
  }
}
