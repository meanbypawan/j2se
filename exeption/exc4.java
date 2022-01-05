class Test{
  public static void main(String args[]){
    String s=null;
    try{
     s.length();
    }
    catch(NullPointerException e){
      System.out.println("Null pointer caught...");
    }
    System.out.println("At the end...");
  }
}
