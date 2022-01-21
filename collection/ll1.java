import java.util.LinkedList;
class TestMain{
  public static void main(String args[]){
    LinkedList<String>ll = new LinkedList<String>();
    ll.add("Atul");
    ll.add("Ankita");
    ll.add("Nikita");
    ll.add("Pihu");
    ll.add("Palak");
    ll.add("Ishu");
    ll.add("Dishu");
    ll.add("Aardhya");
    ll.add("Shreya");
    ll.add("Vaasu");
    ll.addFirst("AAA");
    ll.addLast("ZZZ");
    System.out.println(ll);
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);   
  }
}
