import java.util.ArrayList;
class TestMain{
  public static void main(String args[]){
    
    ArrayList<Integer> al = new ArrayList<Integer>(100);
    al.add(10); // 0
    al.add(20); // 1
    al.add(30);//2
    al.add(30);//3
    al.add(30);//4
    al.add(5); //--> At this point java will create arrayList
    al.add(4);
    al.add(5);
    al.add(6);// At this point java will create new arrayList
    System.out.println(al);
    System.out.println("Total Element : "+al.size());       
  }
}





