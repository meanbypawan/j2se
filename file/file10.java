import java.util.Scanner;
import java.io.File;
class TestMain{
  public static void main(String args[]) throws java.io.FileNotFoundException{
    File f = new File("xyz.txt");
    Scanner sc = new Scanner(f);
    try{
     while(true){
      String line  = sc.nextLine();
      System.out.println(line);
     }
    }
    catch(java.util.NoSuchElementException e){
      System.out.println("Data end.....");
    }     
  }
}
