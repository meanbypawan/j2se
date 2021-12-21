class Addition{
  private int a,b;
  public void setData(int a, int b){
    this.a = a;
    this.b = b;
  }
  public void setA(int a){
    this.a = a;
  }
  public void setB(int b){
    this.b = b;
  }
  public int getA(){
    return a;
  }
  public int getB(){
    return b;
  }
  public void display(){
    System.out.println("a : "+a);
    System.out.println("b : "+b);
  }
}
class TestMain{
  public static void main(String args[]){
    Addition obj = new Addition();// obj-->a=0,b=0
    Addition obj2 = new Addition();
    obj2.setData(3,4);
    obj.display();
    obj.setA(25);
    obj.display(); 
    System.out.println(obj.getB());
    obj.setB(50);
    obj.display(); 
    obj2.setB(6);
    obj.display();
    obj2.setB(9);
    System.out.println(obj.getB());
  }
}
