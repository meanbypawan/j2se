import java.util.ArrayList;
class User{
  private int id;
  private String name;
  private String mobile;
  private int age;
  public User(int id, String name, String mobile, int age){
    this.id = id;
    this.name = name;
    this.mobile = mobile;
    this.age = age;
  }
  public User(){
  
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public String getMobile(){
    return mobile;
  }
  public int getAge(){
    return age;
  }
  public void setId(int id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setMobile(String mobile){
    this.mobile = mobile;
  }
  public void setAge(int age){
    this.age = age;
  }
}
class TestMain{
  public static void main(String arg[]){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    ArrayList<User> al = new ArrayList<User>(1);
    for(int i=1; i<=2; i++){
      System.out.println("Enter Details of "+i+" user");
      
      System.out.println("Enter Id");
      int id = sc.nextInt();
      
      System.out.println("Enter name");
      String name = sc.next();
      
      System.out.println("Enter mobile");
      String mobile = sc.next();
      
      System.out.println("Enter age");
      int age = sc.nextInt();
      
      User user = new User(id,name,mobile,age);
      al.add(user);
    }
    for(User user : al){
      System.out.println(user.getId()+" "+user.getName()+" "+user.getMobile()+" "+user.getAge());
    }
    
  }
}




















