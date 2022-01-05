class IBE extends Exception{
  public IBE(){
    super("Insufficient Balance Exception..");
  }
}
class Bank{
  public void withdrawal() throws IBE{
    /*
      ----
      ----
    */
  }
}
class TestMain{
  public static void main(String arg[]){
    Bank obj = new Bank();
    try{
     obj.withdrawal();
    }
    catch(Exception e){
    
    }
  }
}
