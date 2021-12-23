class Customer{
  private int id;
  private String name;
  private int age;
  public Customer(int id, String name, int age){
    this.id = id;
    this.age = age;
    this.name = name;
  } 
  public void setId(int id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String toString(){
    return id+" "+name+" "+age; // "1 peeku 21"
  }
}
class TestMain{
  public static void main(String args[]){
    String s1 = new String("Cheeku");
    Customer c = new Customer(1,"Peeku",21);   
  
    System.out.println(s1);// s1.toString() : String
    System.out.println(c); // c.toString() : String 
  }
}
