import java.util.ArrayList;
class TestMain{
  public static void main(String args[]){
    ArrayList<String> al1 = new ArrayList<String>();
    al1.add("Cheeku");
    al1.add("Peeku");
    al1.add("Nikku");
 
    ArrayList<String> al2 = new ArrayList<String>();
    al2.add("Cheeku");
    al2.add("Rahil");
    al2.add("Sahil");
    
    ArrayList<String>al3 = new ArrayList<String>();
    al3.add("Cheeku");
    al3.add("Sontu");
    al3.add("Montu");
    
    al1.addAll(al2); // 6 -> 2 Cheeku    
    al1.addAll(al3); // 9 --> 3 Cheeku
    System.out.println(al1);
    
    //al1.removeAll(al2);
    al1.retainAll(al2);
    
    System.out.println(al1);
  }
}






