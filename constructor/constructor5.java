class Test{
   public Test(int x, int y){
     this(20);
     System.out.println("called....");
   }
   public Test(int x){
     this(20,10);
   }
}
class TestMain{
  public static void main(String arg[]){
    Test obj = new Test(20,10);
  }
}
