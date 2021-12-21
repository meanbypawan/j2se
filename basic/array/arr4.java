import java.util.Scanner;
class Test{
  public static void main(String[] arg){
    int[][] a = new int[3][];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Length of 1st row");
    int l1  = sc.nextInt();
    a[0] = new int[l1];
    
    System.out.println("Enter Length of 2nd row");
    l1 = sc.nextInt();
    a[1] = new int[l1];
    
    System.out.println("Enter length of 3rd row");
    l1 = sc.nextInt();
    a[2] = new int[l1];
     		
    System.out.println("Enter Data");
    for(int r=0; r<a.length; r++){
      System.out.println("Enter "+a[r].length+" element in "+(r+1)+" row");
      for(int c=0; c<a[r].length; c++){
        a[r][c] = sc.nextInt();
      }    
    }
    System.out.println("Data.........");
    for(int r=0; r<a.length; r++){
      for(int c=0; c<a[r].length; c++){
        System.out.print("  "+a[r][c]);
      }
      System.out.println();
    }
  }
}






