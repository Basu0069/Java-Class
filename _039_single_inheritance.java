/**
 * single Inheritance
 * Wap by creating a class employee (name,UID,salary)
 * and another child class of manager(Department)
 * you have to take user input
 */


 import java.util.*;
 
 class employee{
     String name;
     int UID;
     double salary;
     employee(String name, int UID, double salary) {
         this.name = name;
         this.UID = UID;
         this.salary = salary;
     }
     
 }
 
 class manager extends employee{
     String department;
     manager(String name, int UID, double salary,String department){
         super(name,UID,salary);
         this.department=department;
     }
     void display() {
         System.out.printf("the employee name is %s and Uid is %d. Total salary is %.2f and department name is %s",name,UID,salary,department);
     }
 }
 public class _039_single_inheritance {
     
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter name:");
         String name = sc.nextLine();
 
         System.out.println("Enter UID:");
         int UID = sc.nextInt();
 
         System.out.println("Enter salary:");
         double salary = sc.nextDouble();
         sc.nextLine();
 
         System.out.println("Enter department:");
         String department = sc.nextLine();
         manager obj = new manager(name,UID,salary,department);
         obj.display();
         
     }
 
 }