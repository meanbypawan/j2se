interface I{
  static void m1(){
    System.out.println("M1-called...");  
  }
}
class TestMain{
  public static void main(String ars[]){
    I.m1();
  }
}
