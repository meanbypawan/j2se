class Student{

}
class TestMain{
    public static void main(String args[]){
      Object x[] = new Object[5];
      x[0] = 10;
      x[1] = "Hello";
      x[2]  = 10.5;
      x[3] = true;
      x[4] = new Student();
      for(Object element: x)
        System.out.println(element);
    }
}
