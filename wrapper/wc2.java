import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
    Scanner sc  = new Scanner(System.in);
    
    System.out.println("Enter 1st number");
    Integer x = sc.nextInt();
    
    System.out.println("Enter 2nd number");
    Integer y = sc.nextInt();
    
    Integer z = x + y;
    System.out.println("Addition : "+z);
    
  }
}
