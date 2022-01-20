import java.util.ArrayList;
class TestMain{
  public static void main(String args[]){
    ArrayList<String> al1 = new ArrayList<String>();
    al1.add("Cheeku");
    al1.add("Peeku");
    al1.add("Nikku");
    al1.add("Kuku");
    al1.add("Cheeku");
    al1.add("Cheeku");
    al1.add("Cheeku");
    al1.add("Peeku");
    
    al1.remove("Cheeku");
    System.out.println(al1);
  }
}
