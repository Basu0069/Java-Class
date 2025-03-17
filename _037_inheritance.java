/**
 * hierarchial inheritance
 * class vehicle and 2 child class
 * car and bike(each with unique attributes of "brand")
 */

 import java.util.*;
 
 class vehicle{
     String brand;
     vehicle(String brand){
         this.brand=brand;
     }
 }
 class car extends vehicle{
     car(String brand){
         super(brand);
     }
     void display() {
         System.out.println("Car brand: "+brand);
     }
 }
 class bike extends vehicle{
     bike(String brand){
         super(brand);
         
     }
     void display() {
         System.out.println("bike brand: "+brand);
     }
 }
 
 public class _037_inheritance {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         car obj = new car(sc.nextLine());
         bike obj1 = new bike(sc.nextLine());
         System.out.println("Brand details: ");
         obj.display();
         obj1.display();
 
     }
 
 }