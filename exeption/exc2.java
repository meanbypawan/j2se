import java.util.Scanner;
import java.util.InputMismatchException;
class Test{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    try{ 
     System.out.println("Enter 1st number");
     int a = sc.nextInt();
     System.out.println("Enter 2nd number");
     int b = sc.nextInt();
     double c = a / b;
     System.out.println("Result : "+c);
    }
    catch(ArithmeticException | InputMismatchException e){
      System.out.println("Oops ! something went wrong..");
    }
    System.out.println("At the end..........");
    
  }
}







