import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st String");
    String s1 = sc.next(); // hello
    
    System.out.println("Enter 2nd String");
    String s2 = sc.next(); // hello
  
    // compareTo(String) : int (0, +, -)
    //int x = s1.compareTo(s2);
    int x = s1.compareToIgnoreCase(s2);
    if(x == 0)
      System.out.println("Same");
    else if(x > 0)
           System.out.println(s1+" > "+s2);
         else
           System.out.println(s1 + " < "+s2);     
  }
}
