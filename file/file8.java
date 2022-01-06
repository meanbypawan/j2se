// Writer<-----FileWriter
// Reader<-----FileReader
import java.io.FileWriter;
import java.io.FileReader;
class TestMain{
  public static void main(String args[]){
    try(FileWriter fw = new FileWriter("test.txt");
    FileWriter fw2 = new FileWriter("hello.txt")){
      fw.write("New Data.......");
      fw2.write("dfd fdklkdf fldfd flkmd");
    }
    catch(Exception e){
      e.printStackTrace();
    }
   
  }
}
