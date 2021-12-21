class A{
  static{
    System.out.println("Block-A");
  }
}
class B{
  static{
    System.out.println("Block-B");
  }
}
class C{
  static{
    System.out.println("Block-C");
  }
  public static void m1(){
    System.out.println("m1 in c called...");
  }
}
class TestMain{
  static{
    System.out.println("Main-Block");
  }
  public static void main(String args[]){
    new A();
    new B();
    new B();
    C.m1();
  }
}
