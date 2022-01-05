class A{
   interface I{
     void m1();
   }
}
class Test implements A.I{
  public void m1(){
    System.out.println("M1-called..");
  }
}
class TestMain{
  public static void main(String arg[]){
    A.I obj = new Test();
    obj.m1();
  }
}




