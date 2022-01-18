class TestMain{
  public static void main(String args[]){
   /*
     1) Primitive--> Object
     2) Object--> Primitive
     3) String --> Primitive
     4) primitive --> String
   */  
   int x = 123;
   
   String s = ""+x;
   System.out.println(s);
   /*
   String s = Integer.toString(x);
   System.out.println(s);
   */
   /*
   Integer iobj = x;
   String s = iobj.toString();
   System.out.println(s); 
   */
  }
}














