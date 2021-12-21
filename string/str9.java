import java.util.Scanner;
// "20 10 50 34 65 70 90"
class TestMain{
  public static void main(String args[]){
    String s = "20 10 50 34 65 70 90";
    String data[] = s.split(" ");
    int sum = 0;
    for(String element : data){
      int e = Integer.parseInt(element);
      sum = sum + e;
    }
    System.out.println(sum);
  }
}
