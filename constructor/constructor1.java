class Test{
   public Test(int x, int y){
     System.out.println("2-parameter.....");
   }
   public Test(int x){
     System.out.println("1-parameter...");
   }
   public Test(){
     System.out.println("Default constr....");
   }
}
class TestMain{
  public static void main(String arg[]){
    Test obj1 = new Test(20,10);
    Test obj2 = new Test(20);
    Test obj3 = new Test();
  }
}
