/*
 Create a class Person with properties (name and age) with following features.
 Default age of person should be 18.
 A person object can be initialized with name and age.
 Method to display name and age of person.
*/
class Person{
  private String name;
  private int age;
  public Person(){
    age = 18;
  }
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public Person(String name){
    this.name = name;
  }
  public void display(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
  }
}
class TestMain{
  public static void main(String arg[]){
    //Person p = new Person("Cheeku"); // p-> age=18,name=null
    //Person p1 = new Person("Cheeku",24);
    Person p2 = new Person();
    p.display();
  }
}








