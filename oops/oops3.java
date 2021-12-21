import java.util.Scanner;
class Distance{
  private int km,meter;
  public void setData(int km, int meter){
    this.km = km;
    this.meter = meter;
  }
  /*
  public void addDistance(Distance k){
    km = km + k.km;
    meter = meter + k.meter;
    if(meter >=1000){
       km++;
       meter -= 1000;
    }
  }
  */
  public void addDistance(Distance k1, Distance k2){
     km = k1.km + k2.km;
     meter = k1.meter + k2.meter;
     if(meter >=1000){
       km++;
       meter-=1000;
     }    
  }
  public Distance addDistance(Distance k){
    Distance temp = new Distance(); // temp--->km,meter
    temp.km = km + k.km;
    temp.meter = meter + k.meter;
    if(temp.meter>=1000){
      temp.km++;
      temp.meter-=1000;
    }
    return temp;
  }
  public void showDistance(){
     System.out.println(km+" km "+meter+" meter");
  }
}
class TestMain{
  public static void main(String args[]){
    Distance d1 = new Distance(); // d1-->km,meter
    Distance d2 = new Distance();// d2--->km,meter
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Distance");
    int km = sc.nextInt();
    int meter = sc.nextInt();    
    d1.setData(km,meter);
     
    System.out.println("Enter Second Distance");
    km = sc.nextInt();
    meter = sc.nextInt();
    d2.setData(km,meter);
    
    d1.showDistance();
    d2.showDistance();
    
    //Distance d3 = d1.addDistance(d2);
    Distance d3 = new Distance();
    d3.addDistance(d1,d2);
    d3.showDistance();
  }
}




