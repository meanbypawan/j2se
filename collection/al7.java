import java.util.ArrayList;
import java.util.Iterator;
class TestMain{
  public static void main(String args[]){
    ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();
    al.add(new StringBuffer("A"));
    al.add(new StringBuffer("A"));
    al.add(new StringBuffer("C"));
    al.add(new StringBuffer("E"));
    al.add(new StringBuffer("D"));
    al.add(new StringBuffer("F"));
    
    Iterator<StringBuffer> itr = al.iterator();
    while(itr.hasNext())
    {
      StringBuffer element  = itr.next();
      if(element.toString().equals("D"))
        itr.remove();
      System.out.println(element);
    } 
    System.out.println(al);
    /*
    for(int i=0; i<al.size(); i++){
      StringBuffer s = al.get(i);
      System.out.println(s);
    }
    */
    
  }
}






