// Writer<-----FileWriter
// Reader<-----FileReader
import java.io.FileWriter;
import java.io.FileReader;
class TestMain{
  public static void main(String args[]){
    FileWriter fw = null;
    try{
      fw = new FileWriter("test.txt");
      fw.write("fdl fdld erir dlfd ereep repoerop");
    }
    catch(Exception e){
      e.printStackTrace();
    }
    finally{
      try{
       fw.close();
       System.out.println("Resource released...."); 
      }
      catch(Exception e){
        e.printStackTrace();
      } 
    }
  }
}
