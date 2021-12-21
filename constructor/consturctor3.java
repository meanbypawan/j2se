class Test{
   public Test(int x, int y){
     System.out.println("2-parameter.....");
     this(20);
   }
   public Test(int x){
     this();
     System.out.println("1-parameter...");
   }
   public Test(){
     System.out.println("Default constr....");
   }
}
class TestMain{
  public static void main(String arg[]){
    Test obj1 = new Test(20,10);
  }
}
