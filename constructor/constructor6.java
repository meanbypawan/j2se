class Addition{
  private int a,b;
  public Addition(int a, int b){
    this.a = a;
    this.b = b;
  }
  public Addition(){}
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
  public int add(){
    return a+b;
  }
}
class TestMain{
  public static void main(String arg[]){
    Addition obj = new Addition(20,10);// obj--> a=20,b=10
    int result = obj.add(); 
    System.out.println("Addition : "+result); 
  }
}
