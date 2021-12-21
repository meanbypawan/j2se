class Test{
  //public static void main(String args[])
  //public static final void main(String args[])
  //public static synchronized void main(String args[])
  //public static strictfp void main(String args[])
  //public static void main(String... args) // var-arg
  // public static void main(String[] args)
  // public static void main(String []args)
  public static final synchronized strictfp void main(String arg[]){
    System.out.println("Main called....");
    System.out.println(arg[0]+" "+arg[1]);
  }
}
