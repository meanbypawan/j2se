// root/Documents/java-itep/file
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
class Test{
  public static void main(String args[]){
    File f = new File("xyz.txt");
    
    if(f.exists()){
      System.out.println("Name : "+f.getName());
      System.out.println("Path : "+f.getAbsolutePath());
      System.out.println("canRead : "+f.canRead());
      System.out.println("canWrite : "+f.canWrite());
      System.out.println("canExecute : "+f.canExecute());
      System.out.println("isHidden  : "+f.isHidden());
      System.out.println("isFile : "+f.isFile());
      System.out.println("isDirectory : "+f.isDirectory());
      System.out.println("length : "+f.length());
      //System.out.println("lastModified : "+f.lastModified());      
      long time = f.lastModified();
      SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy hh:mm");
      String date = sp.format(new Date(time));
      System.out.println("last modified : "+date);
    }
    else{
      System.out.println("File Not Found/Exits");
    }
  }
}




