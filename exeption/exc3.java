import java.util.Scanner;
import java.util.InputMismatchException;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    try{ 
     System.out.println("Enter 1st number");
     int a = sc.nextInt();
     System.out.println("Enter 2nd number");
     int b = sc.nextInt();
     double c = a / b;
     System.out.println("Result : "+c);
    }
    catch(ArithmeticException e){
      System.out.println("Denominator can not be zero..");
    }
    catch(InputMismatchException e){
      System.out.println("please enter integer only..");
    }
    String s = "hello";
      
    try{ 
     System.out.println(s.charAt(5));
    }
    catch(StringIndexOutOfBoundsException e){
      System.out.println("string is too small...");
    } 
    System.out.println("At the end..");
  }
}
