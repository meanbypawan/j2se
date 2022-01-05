interface I{
  void wish();
}

class TestMain{
  public static void main(String ar[]){
    I obj1 = ()->System.out.println("GM");
    I obj2 = ()->System.out.println("GN....");
    I obj3 = ()->System.out.println("GE....");
    obj1.wish(); 
    obj2.wish();
    obj3.wish();
  }
}
