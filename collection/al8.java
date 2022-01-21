import java.util.ArrayList;
import java.util.ListIterator;
class TestMain{
  // ListIterator is a child of Iterator
  public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10); // 0
    al.add(20); // 1
    al.add(30); // 2
    al.add(40); // 3
    al.add(50); // 4
    //ListIterator<Integer> lit = al.listIterator();
    ListIterator<Integer> lit = al.listIterator(-1);
    System.out.println("-----------------------------");
    while(lit.hasPrevious()){
       int element = lit.previous();
       System.out.println(element);
    } 
    /*
    while(lit.hasNext()){
      int element = lit.next(); // it will return data element
      System.out.println(element); 
    }
    */
        
  }
}









