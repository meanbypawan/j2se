class Test{
  public void m1(int x){
    System.out.println("I-version...");
  }
  public void m1(int... x){
    System.out.println("var-arg version...");
  }
}
class TestMain{
  public static void main(String arg[]){
    Test obj = new Test();
    obj.m1(10,20);
  }
}
