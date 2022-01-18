/*
  char ch;
  isSpace(char) : boolean
  isDigit(char) : boolean
  isAlphabetic(char) : boolean
  isUpperCase(char) : boolean
  isLowerCase(char) : boolean
*/
class TestMain{
  public static void main(String arg[]){
    char ch = '#';
    
    if(Character.isAlphabetic(ch))
      System.out.println("Alphabate Symbol..");
    else
      System.out.println("Not Alphabste symbol..");  
  }
}
