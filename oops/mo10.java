class Test{
   public void m1(String s){
     System.out.println("String version...");
   }
   public void m1(Object s){
     System.out.println("Object version");
   }
}
class TestMain{
    public static void main(String args[]){
    
       Test obj = new Test();
       obj.m1(100);
    }
}
