interface I1{
  void m1();
}
interface I2{
  void m1();
  void m2();
}
class C implements I1,I2{
   public void m1(){
     System.out.println("m1-called....");
   }
   public void m2(){
     System.out.println("m2-called...");
   }
   public void m3(){
     System.out.println("m3-called...");
   }
}

class TestMain{
  public static void main(String ar[]){
     I1 obj = new C();
     I2 obj2 = new C();
     C obj3 = new C();
  }
}


