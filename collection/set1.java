/*
  ArrayList al = new ArrayList(); : ic:10
  HashSet hs = new HashSet(); :-0.75 ic:- 16
  0.75 is 75% of 1
  HashSet()
  HashSet(int,float)
*/
import java.util.LinkedHashSet;
class TestMain{
  public static void main(String args[]){
     // ic:-16 , lf : 0.75
     LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
     hs.add(10);
     hs.add(50);
     hs.add(90);
     hs.add(20);
     hs.add(40);
     hs.add(30);
     hs.add(90);
     for(int element : hs)
       System.out.println(element);
  }
}
