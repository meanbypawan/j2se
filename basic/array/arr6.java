class Test{
  public static void main(String[] arg){
    int a[][] = {
                  {10,20,30},
                  {40,50},
                  {60,70,80,90} 
                };
                
    for(int[] row : a){
      for(int element : row){
        System.out.print(" "+element);
      }
      System.out.println();
    }            
  }
}






