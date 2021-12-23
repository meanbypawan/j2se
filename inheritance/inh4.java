class A{
  protected int l=3,w=5;
}
class B extends A{
  protected int l=10,w=20;
  public void display(){
    System.out.println("l : "+l+" w : "+w);
    System.out.println("parent-l : "+super.l+" parent-w : "+
    super.w);
  }
}
class TestMain{
  public static void main(String arg[]){
    B obj = new B();
    obj.display();
  }
}
