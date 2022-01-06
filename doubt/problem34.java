/*
 Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
 Only parameterized constructor;
 totalSalary always represent total of all the salaries of all employees created.
 empNo should be auto incremented.
 display total employees and totalSalary using class method.
*/
class Employee{
  private int empNo;
  private int salary;
  private static int totalSalary;
  private static int counter=0;
  public Employee(int salary){
    this.empNo = ++counter;
    this.salary = salary;
    totalSalary += salary;
  }
  public static void display(){
    System.out.println("Total Salary : "+totalSalary);
    System.out.println("Total Employee : "+counter);
  }
}
class TestMain{
  public static void main(String argg[]){
    Employee e  = new Employee(50000);
    Employee e2 = new Employee(60000);
    Employee.display();
  }
   
}






