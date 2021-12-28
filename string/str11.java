class TestMain{
  public static void main(String args[]){
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");
    
    System.out.println(s1.equals(s2)); // true
    System.out.println(sb1.equals(sb2));// false
  }
}
