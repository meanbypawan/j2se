class TestMain{
  public static void main(String args[]){
    try{
     /*
       -----
     */
     //throw new ArrayIndexOutOfBoundsException();
     throw new Throwable();
    }
    catch(Throwable e){
       System.out.println("Exception Caught...");
    }
    System.out.println("At the end........");
  }
}

