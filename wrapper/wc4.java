/*
  Byte.parseByte()
  Short.paseShort()
  Integer.parseInt()
  Float.parseFloat()
  Double.parseDouble()
  Long.parseLong()
*/
class TestMain{
  public static void main(String args[]){
    String s = "2147483648";
    long l = Long.parseLong(s);
    System.out.println(l);
    /*
    String s = "3.14F";
    //double d = Double.parseDouble(s);
    float f = Float.parseFloat(s);
    System.out.println(f);
    */
    /*
    // String ---> Primitive
    String s = "2147483648";
    //byte x = Byte.parseByte(s);
    int x = Integer.parseInt(s);
    System.out.println(x);
    */
  }
}








