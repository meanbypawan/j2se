import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = sc;
    /*
      ----
      ----
    */
    sc = null;
    // 251
    //--------
    sc2 = null;
  }
}
