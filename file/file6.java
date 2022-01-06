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
  int serialVersionUID = 1L;
  public Customer(int id, String name, String mobile, int age){
    this.id = id;
    this.name = name;
    this.mobile = mobile;
    this.age = age;
  }
  public Customer(){}
  public int getId
  (){return id;}
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
      while(true){
      try{ 
        ObjectInputStream ois = new ObjectInputStream(fin);
        Customer c = (Customer)ois.readObject();
        System.out.println(c);//c.toString()
       }
       catch(java.io.IOException e){
         break;
       }
      }
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
                new FileOutputStream("customer.txt",true);
       ObjectOutputStream oos =
                new ObjectOutputStream(fout);
       Customer c = new Customer(2,"Peeku","90091133",8);
       
       oos.writeObject(c);
       System.out.println("Operation Success..");
    }
    catch(Exception e){
      e.printStackTrace();
    }
  } 
}














