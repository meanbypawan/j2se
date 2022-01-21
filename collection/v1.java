import java.util.Vector;
/*
  Vector() :--10
  Vector(int ic)
  Vector(Collection)
  Vector(int ic, int capacityIncrementor)
*/
class TestMain{
  public static void main(String args[]){
    Vector<Double> v = new Vector<Double>(3,2);
    System.out.println("Capactiy : "+v.capacity());
    v.add(1.3);
    v.add(1.6);
    v.add(1.7);
    v.add(1.8);
    System.out.println("Capactiy : "+v.capacity());
  }
}
