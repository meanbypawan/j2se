class Test{
   public Test(int x, int y){
     this(20),this();
     System.out.println("2-parameter.....");
     
   }
   public Test(int x){
     System.out.println("1-parameter...");
   }
   public Test(){
    System.out.println("Default contr");
   }
}
class TestMain{
  public static void main(String arg[]){
    Test obj1 = new Test(20,10);
  }
}
