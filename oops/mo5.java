class Test{
  public void m1(byte x){
    System.out.println("Byte-versioin");
  }
  public void m1(short x){
    System.out.println("Short-versioin");
  }
  
  public void m1(long x){
    System.out.println("Long-versioin");
  }
  
  public void m1(int x){
    System.out.println("Int-versioin");
  }
  
}
class TestMain{
  public static void main(String arg[]){
    Test obj = new Test();
    byte x = 20;
    obj.m1(x);
  }
}








