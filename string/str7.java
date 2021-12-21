/*
  ArrayIndexOutOfBoundsException :--Array
  StringIndexOutOfBoundsException :- String
  IndexOutOfBoundsException :--Collection
*/
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    String s = "Infobeans Foudation";
    
    char ch = s.charAt(200);// StringIndexOutOfBoundsException
    System.out.println(ch);
    /*
    String s1 = "hello";
    String s2 = "Hello";
    if(s1.equalsIgnoreCase(s2))
      System.out.println("Same");
    else
      System.out.println("Not same");  
    */
    /*
    String s = "www$youtube$com";
    String data[] = s.split("\\.");
        
    for(String element : data)
      System.out.println(element); 
    */
  }
}
