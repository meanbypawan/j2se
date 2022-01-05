import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Customer implements Serializable{
  private int id;
  private String name;
  private String mobile;
  private int age;
  public Customer(int id, String name, String mobile, int age){
    this.id = id;
    this.name = name;
    this.mobile = mobile;
    this.age = age;
  }
  public Customer(){}
  public int getId(){return id;}
  public String getName(){return name;}
  public String getMobile(){return mobile;}
  public int getAge(){return age;}
  public String toString(){
    return id+" "+name+" "+mobile+" "+age;
  }
}
class ReadingObject{
  public static void main(String args[]){
    try{
      FileInputStream fin = new FileInputStream("customer.txt");
      ObjectInputStream ois = new ObjectInputStream(fin);
      
      Customer c = (Customer)ois.readObject(); // Object
      System.out.println(c);//c.toString()
      
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
class WritingObject{
  public static void main(String ar[]){
    try{
       FileOutputStream fout = 
                new FileOutputStream("customer.txt");
       ObjectOutputStream oos =
                new ObjectOutputStream(fout);
       Customer c = new Customer(1,"Cheeku","90091122",5);
       
       oos.writeObject(c);
       System.out.println("Operation Success..");
    }
    catch(Exception e){
      e.printStackTrace();
    }
  } 
}














