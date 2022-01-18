import java.util.Scanner;
class DataValidation{
  public static String isValidMobile(String mobile){
    
    mobile = mobile.trim();
    try{
      Long.parseLong(mobile);
      if(mobile.length()!=10)
        return "Mobile must containt 10 digit";
    }
    catch(Exception e){
      return "Only digit is allowed";
    }
    return "";
  }
  public static boolean isValidName(String name){
     name = name.trim();
     for(int i=0; i<name.length(); i++){
       char ch = name.charAt(i);
       if(!(Character.isAlphabetic(ch) || Character.isSpace(ch)))
        return false;  
     }
     return true;
  }
}
class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Mobile Number");
     String mobile = sc.next();
     String status = DataValidation.isValidMobile(mobile);
     if(status.equals(""))
       System.out.println("Valid");
     else
       System.out.println(status);  
     /*
     System.out.println("Enter name");
     String name = sc.nextLine();
     if(DataValidation.isValidName(name))
       System.out.println("Valid name");
     else
       System.out.println("Invalid name");        
     */
  }
}
