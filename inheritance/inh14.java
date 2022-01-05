interface I1{
  void m1();
}
interface I2{
  void m1();
}
class C{
  public void m1(){
    System.out.println("m1-called... in C");
  }
}
class C2 extends C implements I1,I2{
  
}
class TestMain{
  public static void main(String args[]){
     new C2().m1();
  }
}
