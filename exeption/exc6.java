import java.util.Scanner;
class IBE extends Exception{
  public IBE(){
    super("Insufficient Balance Exception..");
  }
  public IBE(String message){
    super(message);
  }
}
class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int bal = 50000;
     System.out.println("Enter Amount");
     int amount = sc.nextInt();
     try{
      if(amount > bal)
        //throw new IBE();
        //throw new IBE("Earn More Money...");
        throw new Exception("Test Exception...");
      else{
       System.out.println("Withdrawal Success...");
       bal -= amount;
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }  
   }       
 }



