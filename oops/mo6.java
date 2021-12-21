class Test{
   public void m1(int x){
     System.out.println("I-version");
   }  
   public String m1(float x){
     System.out.println("Float version..");
     return "Cheeku";
   }
}
class TestMain{
  public static void main(String arg[]){
    Test obj = new Test();
    obj.m1(10);
  }
}








