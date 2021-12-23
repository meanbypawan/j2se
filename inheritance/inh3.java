class A{
  public A(int x){
    System.out.println("A-parameter...");
  } 
}
class B extends A{
  public B(int x){
    super(x);
    System.out.println("B-parameter...");
  }
  public B(){
    super(100);
    System.out.println("B-deafult..");
  }
}
class TestMain{
  public static void main(String ar[]){
    B obj = new B(10);
  }
}

