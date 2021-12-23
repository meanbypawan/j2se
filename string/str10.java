class TestMain{
  public static void main(String args[]){
     StringBuffer sb = new StringBuffer("hello");// sb->"hello"
     
     System.out.println(sb); // hello
     
     sb.append("World");
     System.out.println(sb); // helloworld
  }
}
