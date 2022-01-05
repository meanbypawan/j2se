import java.io.File;
class Test{
  public static void main(String arg[]){
    File f = new File("/home/pawan/Documents");
    
    File item[] = f.listFiles();
    
    for(File fileItem : item)
    { 
      if(fileItem.isFile()) 
        System.out.println(fileItem.getName());
    }
  }
}
