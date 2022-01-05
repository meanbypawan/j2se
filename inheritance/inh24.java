class A{
  static{
    System.out.println("Outer Block");
  }
  public void m1(){
    System.out.println("m1-called in A");
  }
  static class B{
    static{
     System.out.println("Inner Block");
    } 
    static public void m2(){
      System.out.println("m2-called in B");
    }
  }
}
class TestMain{
   public static void main(String arg[]){
     A.B.m2();
   }
}

