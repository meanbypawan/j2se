class Test{
  /*
  public void m1(int x, int y){
    System.out.println("I-I version");
  }
  */
  public void m1(int x, long y){
    System.out.println("I-L version");
  }
  public void m1(long x, int y){
    System.out.println("L-I version");  
  }
}
class TestMain{
  public static void main(String arg[]){
    Test obj = new Test();
    obj.m1(20,10L);
  }
}
