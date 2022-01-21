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
    User u1 = new User(1, "A","111111",21);
    User u2 = new User(2, "B","111122",26);
    User u3 = new User(3, "D","111133",24);
    User u4 = new User(4, "F","111144",29);
    User u5 = new User(5, "E","111155",30);
  
    ArrayList<User> al = new ArrayList<User>();
    al.add(u1);
    al.add(u2);
    al.add(u3);
    al.add(u4);
    al.add(u5);
    
    for(User user : al){
      System.out.println(user.getId()+" "+user.getName()+" "+user.getMobile()+" "+user.getAge());
    }
    
  }
}




















