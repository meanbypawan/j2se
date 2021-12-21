class Test{
  public void m1(int y, int z, int... x){
    for(int i=0; i<x.length; i++)
      System.out.println(x[i]);
  }
}
class TestMain{
  public static void main(String arg[]){
    Test obj = new Test();
    obj.m1(10,20);
  }
}
