import java.util.Scanner;
/*
  35) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user 
and store in an array

Find Pid of product with highest price.
Create method (with array of product’s object as argument)
 in XYZ class to calculate and return total amount spent
  on all products. (amount spent on single product=price of product * quantity of product).
*/
class Product{
  private int pid;
  private int price;
  private int quantity;
  public Product(int pid, int price, int quantity){
    this.pid = pid;
    this.price = price;
    this.quantity = quantity;
  }
  public int getPid(){
    return pid;
  }
  public int getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }
}
class TestMain{
  public static int totalAmoutSpent(Product p[]){
    int totalAmount = 0;
    for(Product product : p)
      totalAmount += product.getPrice()*product.getQuantity();
    return totalAmount;
  }
  public static int getProductIdWithHighestPrice(Product p[]){
     int maxPrice = p[0].getPrice();
     int id = p[0].getPid();
     for(int i=1; i<p.length; i++){
       if(maxPrice < p[i].getPrice()){
         maxPrice = p[i].getPrice();
         id = p[i].getPid();
       }
     }
     return id;
  }
  public static void main(String arg[]){
    // Create five reference of type product
    Scanner sc = new Scanner(System.in);
    Product p[] = new Product[5]; 
    for(int i=0; i<p.length; i++){
      System.out.println("Enter "+(i+1)+" product det..");
      
      System.out.println("Enter Product Id");
      int productId = sc.nextInt();
      
      System.out.println("Enter Product Price");
      int productPrice = sc.nextInt();
      
      System.out.println("Enter Quantity");
      int productQty = sc.nextInt();
      
      p[i] = new Product(productId,productPrice,productQty);
    }
    int id = TestMain.getProductIdWithHighestPrice(p);
    int totalAmount = TestMain.totalAmoutSpent(p);
    System.out.println("Id of Max Price : "+id);
    System.out.println("Total Amount : "+totalAmount);
  }
}









