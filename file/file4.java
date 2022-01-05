//FileOutputStream to write date into file
import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     File f = new File("xyz.txt");
     try{
      if(f.exists()){
       System.out.println("Enter Data");
       String s = sc.nextLine();
       s += "\n";
       FileOutputStream fout = new FileOutputStream(f,true);
       
       byte data[] = s.getBytes();
       fout.write(data);
      }
     }
     catch(Exception e){
       System.out.println("Oops ! Something went wrong...");
     }
  }
}
