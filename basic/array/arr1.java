class Test{
  public static void main(String args[]){
    //int a[] = new int[2147483647];
    
    // byte-->short---> Integer
    // char ---. Integer
    //char x = 100;
    
    //int a[] = new int['A']; // 65
    //int a[] = new int[10];
    //int a[] = new int[0];
    //int a[] = new int[10];
    byte a[] = new byte[1000];
    System.out.println(a.getClass().getName());//[B
    short b[] = new short[1000];
    
    System.out.println(b.getClass().getName());//[S
    int c[] = new int[1000];
    System.out.println(c.getClass().getName());//[I
    
    long d[] = new long[1000];
    System.out.println(d.getClass().getName());//[J
    
    float e[] = new float[1000];
    System.out.println(e.getClass().getName());//F
    
    double f[] = new double[1000];
    System.out.println(f.getClass().getName());//D
    
    boolean g[] = new boolean[1000];
    System.out.println(g.getClass().getName());//[Z
    
    char h[] = new char[1000]; 
    System.out.println(h.getClass().getName());//[C
  }
}










