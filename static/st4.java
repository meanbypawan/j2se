class TestMain{
  {
    System.out.println("Initializer block....");
  }
  static{
    System.out.println("Static-Block");
    new TestMain().m1();
  }
  public TestMain(){
    System.out.println("Consturcotr called...");
  }
  private void m1(){
    System.out.println("Instance Method called..");
  }
  public static void main(String args[]){
    System.out.println("Main called....");
    new TestMain();
  }
}
