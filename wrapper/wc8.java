import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number");
    
    int x = sc.nextInt();
    
    String s = new StringBuffer(""+x).reverse().toString();
  
    x = Integer.parseInt(s);
    
    System.out.println(x);
  }
}
