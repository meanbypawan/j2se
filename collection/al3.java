// Generic
import java.util.ArrayList;
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     ArrayList<Integer> al = new ArrayList<Integer>();
     al.add(10);
     al.add(15);
     al.add(5);
     al.add(20);
     System.out.println("Total element: "+al.size());
     System.out.println("Enter element...");
     int element = sc.nextInt();    
     if(al.contains(element))
       System.out.println("element found..");
     else
       System.out.println("element not found..");   
  }
}






