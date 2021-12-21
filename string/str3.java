class TestMain{
  public static void main(String args[]){
    String s1 = "Infobeans Foundation";
    int x = s1.length();
    System.out.println("Length : "+x);
    
    String s2 = s1.toUpperCase(); // INFOBEANS FOUNDATION
    System.out.println(s1); // Infobeans Foundtion
    System.out.println(s2);// INFOBEANS FOUNDATION
  
    String s3 = "         Infobeasn Foundation        ";
    s3 = s3.trim(); // "Infobeans Foundation"
    String s4 = "Infobeans Foundation";
    System.out.println(s3+"$");
    System.out.println(s3 == s4); //false
  }
}
