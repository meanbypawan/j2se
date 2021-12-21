import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     int salaryList[] = new int[10];
     for(int i=0; i<10; i++){
       System.out.println("Enter Salary");
       salaryList[i] = sc.nextInt();
     }
     
     System.out.println("Salary List....");
     for(int i=0; i<10; i++)
       System.out.println(salaryList[i]);
     
  }
}
