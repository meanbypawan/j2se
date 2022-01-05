interface I{

}
class A implements I{

}
class B implements I{

}
class C implements I{

}
class Test{
  public void m1(I obj){
    System.out.println("called...");
  }
}
class TestMain{
  public static void main(String argg[]){
     I obj = new B();
     Test obj2 = new Test();
     obj2.m1(obj);
  }
}
