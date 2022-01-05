interface Task{
  int operation(int x, int y);
}

class TestMain{
  public static void main(String ar[]){
     Task obj1 = (a,b)->  a+b ;
     Task obj2 = (a,b)-> a-b ;
     Task obj3 = (a,b)->{
        if(a > b)
          return a;
        return b;  
     };   
     
     int result = obj1.operation(20,10);
     System.out.println("Addition : "+result); 
     
     System.out.println("Subtraction : "+obj2.operation(20,10));
  
     System.out.println("Greater : "+obj3.operation(20,10)); 
  }
}
