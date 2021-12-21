class Test{
 
  public void m1(int y){
    System.out.println("F-version");
  }
  
  public void m1(double x){
    System.out.println("D-version");
  }
  
  public void m1(int x){
    System.out.println("I-version");
  }
  
}
class TestMain{
  public static void main(String arg[]){
     Test obj = new Test();
     obj.m1(10);
  }
}
