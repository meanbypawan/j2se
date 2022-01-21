import java.util.ArrayList;
import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    for(int i=1; i<=5; i++){
      try{
       System.out.println("Enter "+i+" element");
       int element = sc.nextInt();
       al.add(element);
      }
      catch(Exception e){
        --i;
        System.out.println("Invalid please reenter..");  
        sc.next();
      } 
    }
    System.out.println("Data..........");
    for(Integer element : al)
      System.out.println(element);
  }
}
