import java.util.Scanner;
class Test{
  public static void main(String[] arg){
    int[][] a = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Matrix of (3X3)");
    
    for(int r=0; r<a.length; r++){
      System.out.println("Enter "+a[r].length+" element of "+(r+1)+" row");
      for(int c=0; c<a[r].length; c++)
      {
        a[r][c] = sc.nextInt();
      }
    }
    System.out.println("Given Matrix....");
    for(int r=0; r<a.length; r++){
      for(int c=0; c<a[r].length; c++){
        System.out.print(" "+a[r][c]);
      }
      System.out.println();
    }
  }
}
