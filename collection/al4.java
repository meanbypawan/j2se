/*
  IndexOutOfBoundsException -->collection
  ArrayIndexOutOfBoundsException ---> Array
  StringIndexOutOfBoundsException --> String
*/ 
import java.util.ArrayList;
import java.util.Scanner;
/*
  public boolean add(Integer obj); // collection
  public void add(int index, Integer obj){ // list
    if(index>this.size())
      throw new IndexOut.......();
    else{
    
    }
  }
  public boolean remove(int index){
  
  }
  public Integer remove(Object val){
  
  }
  al.remove(3); 
*/
class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     ArrayList<Integer> al = new ArrayList<Integer>();
     al.add(10); 
     al.add(15);
     al.add(5);
     al.add(20);//
     al.add(30);
     al.add(40);
     al.add(50);
     al.add(2);
     al.add(4);
     al.add(3);
     System.out.println(al);
     al.remove(new Integer(3)); // 3rd index
     System.out.println(al);     
     /*
      System.out.println(al);
      al.add(al.size(),500);
      System.out.println(al);
     */
  }
}






