class Test{
  public static void main(String args[]){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.println("Enter Gender (M/F)");
    char gender = sc.next().charAt(0);
    if(gender == 'M' || gender == 'm')
      System.out.println("Male");
    else if(gender == 'F' || gender == 'f')
          System.out.println("Female");
          
      
       
  }
}
