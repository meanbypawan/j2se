import java.util.ArrayList;
class TestMain{
  public static void main(String args[]){
    //ArrayList al = new ArrayList();
    ArrayList<Object> al = new ArrayList<Object>();
    al.add(100);
    al.add("Cheeku");
    al.add(3.14);
    al.add(1.2f);
    al.add(true);
    al.add(new StringBuffer("Peeku"));
    System.out.println(al);
  }
}
