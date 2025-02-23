// Q Non- parametrised constructor
// create  class with name Employee
// use non paramterised const. for class 
// intialize name & salary of emp. 
// print in main method 


public class _024_Non_Parametrized {
  

static class Employee{
    String name;
    double salary;


    Employee(){
        name="Basu";
        salary=10000.0;
    }
    void displayValue(){
        System.out.println("Employee name: "+ name);
        System.out.println("Salary is :"+ salary);
    }
}


    
public static void main(String[] args) {
    

Employee emp = new Employee();
emp.displayValue();

}
}
