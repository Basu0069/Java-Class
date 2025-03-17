// Use this to return current instance(Method chaining);
/*
 * 1. Create a method parameterized 
 * 2.Create an object of name(use this to print current object)
 * 3.Return this keyword(which will actually return my variable)
 * 4.Create display method to print name
 * 5.call method in main method 
 */

 

import java.util.Scanner;

public class _034_this6 {

    String name;

    public _034_this6(String name){
        this.name=name;
    }
    public _034_this6 setname(String name) {
        this.name = name; 
        return this;  
    }

    void display(){
        System.out.println("THe name is :"+ this.name);
        // return this.name;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        // new _034_this6().setname(sc.nextLine()).display();
        _034_this6 obj = new _034_this6("");
        obj.setname("Basu").display();
        sc.close();

    }
}
