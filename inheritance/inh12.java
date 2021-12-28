import java.util.Scanner;
abstract class Shape{
   abstract public void getArea();
}
//------------------------------------------
class Circle extends Shape{
  public void getArea(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius");
    int r = sc.nextInt();
    System.out.println("Circle Area : "+(3.14*r*r));
  }
}
class Rectangle extends Shape{
  public void getArea(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter lengt and width");
     int l = sc.nextInt();
     int w = sc.nextInt();
     System.out.println("Rectangle Area : "+(l*w));
  }
}
class TestMain{
  public static void main(String ar[]){
     Shape s = null;
     Scanner sc = new Scanner(System.in);
     while(true){
        System.out.println("Press 1 for circle");
        System.out.println("Press 2 for rectangle");
        System.out.println("Press 3 for exit");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();
        if(choice == 1){
          s = new Circle();
          s.getArea();
        }
        else if(choice == 2){
          s = new Rectangle();
          s.getArea();
        }
        else if(choice == 3)
               break;
             else{
               System.out.println("Invalid choice(Re-enter)");
             }
      } 
  }
}








