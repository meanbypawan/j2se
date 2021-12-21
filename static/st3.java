
class TestMain{
  {
    System.out.println("Initializer block....");
  }
  static{
    System.out.println("Static-Block");
  }
  public TestMain(){
    System.out.println("Consturcotr called...");
  }
  public static void main(String args[]){
    TestMain obj = new TestMain();
    TestMain obj2 = new TestMain();
    System.out.println("Main-end...."); 
  }
}// Static-Block---> InitialBlock->Contructon->Inita-Con
