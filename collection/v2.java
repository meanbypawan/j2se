import java.util.Vector;
import java.util.Enumeration;
class TestMain{
  public static void main(String args[]){
    Vector<Double> v = new Vector<Double>(3,2);
    v.add(1.3);
    v.add(1.6);
    v.add(1.7);
    v.add(1.8);
    Enumeration<Double> e = v.elements();
    while(e.hasMoreElements()){
      System.out.println(e.nextElement());
    }
    /*
      hasNext()      ---->  hasMoreElement()
      next()------------->  nextElement()
    */
  }
}
