import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     String s = "100012 Rahil 9009111222 25 indore";
     String data[] = s.split(" ");
     if(data[0].equals("100012")){
       System.out.println("Record Found");
     }
     else
       System.out.println("Record Not Found");
     for(String info : data){
        System.out.println(info);
     }  
     
  }
}
