class Area{
  private int l,w;
  public void setData(int l, int w){
    this.l = l;
    this.w = w;
  }
  public void setL(int l){
    this.l = l;
  }
  public void setW(int w){
    this.w = w;
  }
  public int getL(){
    return l;
  }
  public int getW(){
    return w;
  }
  public int getArea(){
    return l*w;
  }
}
class Volume extends Area{
  private int h;
  public void setData(int l, int w, int h){
    setData(l,w);
    this.h = h;
  }
  public int getVolume(){
    return getL()*getW()*h;
  }
}
class TestMain{
  public static void main(String arg[]){
    Volume v = new Volume();
    v.setData(2,3,4);
    System.out.println("Area : "+v.getArea());
    System.out.println("Volume : "+v.getVolume());
  }
}
