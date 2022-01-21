import java.util.LinkedHashSet;
class TestMain{
  public static void main(String args[]){
     // ic:-16 , lf : 0.75
     LinkedHashSet<String> lhs = new LinkedHashSet<String>();
     String s1 = new String("Cheeku");
     String s2 = new String("Cheeku");
     String s3 = new String("Cheeku");
     String s4 = new String("Cheeku");
     
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
     System.out.println(s3.hashCode());
     System.out.println(s4.hashCode()); 
     /*
     lhs.add(new String("Cheeku"));
     lhs.add(new String("Cheeku"));
     lhs.add(new String("Cheeku"));
     lhs.add(new String("Cheeku"));
     
     for(String s : lhs)
       System.out.println(s.hashCode()); 
     */
  }
}






