interface I{
  int STATUS_CODE = 200;
}
class TestMain{
  public static void main(String args[]){
     //I.STATUS_CODE = 200;
     System.out.println(I.STATUS_CODE);
  }
}
