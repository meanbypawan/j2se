class Test{
  public void m1(){
    System.out.println("Default version of m1");
  }
  public void m1(int x){
    System.out.println("Integer version");
  }
}
class TestMain{
  public static void main(String rg[]){
    Test obj;
    obj = new Test();
    obj.m1();
    obj.m1(100); 
  }
}

