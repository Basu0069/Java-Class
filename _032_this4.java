

/* 
 * Using this as an argument in method call
 * 1.Create a method greet 
 * 2.Create a method display(Print Hello! + name)
 * 3.Call Display in Greet by passing this as argument
 * 4.Call Greet method in main method 
 */

import java.util.Scanner;

public class _032_this4 {

    
    String name;

    _032_this4(String name){
        this.name= name;
    }


    void greet(){
        System.out.println("Greet function called");
        display(this);
    }

    void display(_032_this4 t){
        System.out.println("Hello"+name);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    new _032_this4(sc.nextLine()).greet();
    sc.close();
 


    }
}
