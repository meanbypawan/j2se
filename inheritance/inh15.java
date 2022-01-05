interface I{
   default void wish(){
     System.out.println("GM.....");
   }
}
class Test implements I{
   public void m1(){}
   public void m2(){}
   public void wish(){
     System.out.println("GN....");
   }
}
