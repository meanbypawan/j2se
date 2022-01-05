class EmptyStringException extends Exception{
  public EmptyStringException(){
    super("String Is Empty");
  }
}
class MyString{
  private String data;
  public MyString(String data){
    this.data = data;
  }
  public MyString(){
    data = "";
  }
  public String getData(){
    return data;
  }
}
class TestMain{
  public static void main(String arg[]){
    MyString s = new MyString(""); // s-> data="hello"
    try{
     if(s.getData().equals(""))
       throw new EmptyStringException();
     else
      System.out.println(s.getData().length());  
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}




