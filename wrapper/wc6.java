class TestMain{
  public static void main(String arg[]){
    if(arg.length == 2){
      float x = Float.parseFloat(arg[0]);
      float y = Float.parseFloat(arg[1]);
      System.out.println("Addition : "+(x+y));
    }
    else
    {
      System.out.println("Only and only two element is allowed");
    }
  }
}
