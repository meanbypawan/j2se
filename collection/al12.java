import java.util.ArrayList;
import java.util.Collections;
// Collection and Collections
class TestMain{
  public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(20);
    al.add(50);
    al.add(10);
    al.add(5);
    al.add(40);
    al.add(40);
    al.set(2,2000);
    Collections.sort(al); // 
    for(int x : al)
      System.out.println(x);
  }
}
