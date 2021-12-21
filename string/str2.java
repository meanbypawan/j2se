class TestMain{
  public static void main(String args[]){
    String s1 = new String("hello").intern(); // SCP
    String s2 = "hello";
    String s3 = new String("hello");
    System.out.println(s1==s3);
    /*
    String s1 = "hello"; // SCP
    String s2 = "hello"; // SCP
    String s3 = new String("hello"); // HEAP
    String s4 = s3.intern();
    
    System.out.println("s1 == s2 : "+(s1==s2)); // true
    System.out.println("s1 == s3 : "+(s1 == s3));//true
    System.out.println("s1.equals(s3) : "+s1.equals(s3));//true 
    System.out.println("s4 == s1 : "+(s4 == s1));
    */
  }
}
