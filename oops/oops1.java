class Addition{
 private int a,b;
 public void setData(int x, int y){
   a = x;
   b = y;
 }
 public void add(){
   System.out.println("Addition : "+(a+b));
 }
}
class TestMain{
  public static void main(String args[]){
    Addition obj = new Addition();// obj--> a=0,b=0
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter 2 number");
    int x = sc.nextInt();
    int y = sc.nextInt();
    obj.setData(x,y);
    obj.add();
  }
} 
