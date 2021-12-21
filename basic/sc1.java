import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter 1st number");
     int x = sc.nextInt();
     
     System.out.println("Enter 2nd number");
     int y = sc.nextInt();
     
     sc.close();  
        
     System.out.println("Addition : "+(x+y));
 
  }
}
