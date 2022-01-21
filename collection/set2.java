/*
  ArrayList al = new ArrayList(); : ic:10
  HashSet hs = new HashSet(); :-0.75 ic:- 16
  0.75 is 75% of 1
  HashSet()
  HashSet(int,float)
  
*/
import java.util.LinkedHashSet;
class User{
  private int id;
  private String name;
  private int age;
  public User(int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }
  public User(){}
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public int hashCode(){
    System.out.println("hashCode()-called...");
    return id;
  }  
  public boolean equals(Object o){
    User user = (User)o;
    return (this.id == user.id) && this.name.equals(user.name);
  } 
}
class TestMain{
  public static void main(String args[]){
     // ic:-16 , lf : 0.75
     LinkedHashSet<User> lhs = new LinkedHashSet<User>();
     lhs.add(new User(1,"Cheeku",21));
     lhs.add(new User(2,"Peeku",27));
     lhs.add(new User(3,"Rahil",25));
     lhs.add(new User(4,"Sahil",22));
     lhs.add(new User(5,"Sontu",23));
     lhs.add(new User(1,"Chinki",21));
      
     for(User u : lhs)
       System.out.println(u.getId()+" "+u.getName()+" "+u.getAge());
  }
}






