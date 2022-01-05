import java.util.Scanner;
class Test{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number");
    int a = sc.nextInt();
    System.out.println("Enter 2nd number");
    int b = sc.nextInt();
    try{
     int c = a / b;
     System.out.println("Result : "+c);
    }
    catch(ArithmeticException e){
      e.printStackTrace();
      //System.out.println(e); // e.toString()
      //System.out.println(e.getMessage());
    }
    System.out.println("At the end..........");
    
  }
}







