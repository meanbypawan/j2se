class A{
  public void m1() throws IOException{
  
  }
}
class B extends A{
  public void m1() throws Exception{
  
  }
}
class TestMain{
  public static void main(String ar[]){
    A obj = new B();
    obj.m1();
  }
}
