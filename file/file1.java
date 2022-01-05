// root/Documents/java-itep/file
import java.io.File;
class Test{
  public static void main(String args[]){
    File f = new File("xyz.txt");
    
    if(f.exists()){
      System.out.println("File Exists/Found");
    }
    else{
      System.out.println("File Not Found/Exits");
      try{
       f.createNewFile();
      }
      catch(java.io.IOException e){
         System.out.println("Caught...");
      } 
    }
  }
}
