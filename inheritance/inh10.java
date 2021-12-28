abstract class Area{
  private int l,w;
  public Area(int l, int w){
    this.l = l;
    this.w = w;
  }
  public int getL(){
    return l;
  }
  public int getW(){
    return w;
  }
  public void setL(int l){
    this.l = l;
  }
  public void setW(int w){
    this.w = w;
  }
  abstract public int getArea();
}
class Rectangle extends Area{
 public Rectangle(int l, int w){
   super(l,w);    
 }
 public int getArea(){
   return getL()*getW();
 }
}
class TestMain{
  public static void main(String arg[]){
     Area obj = new Rectangle(2,3);   
     System.out.println("Area : "+obj.getArea());
  }
}
