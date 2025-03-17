/*Quest Enter size of a box 
1. Create parameterixed constructor(Assign user i.p to variable)
2.Create non paraeterized(Call constructor with default value of size)
3.Create method display
Call display method in main to print size of box by user i/package 

*/

import java.util.Scanner;

public class _031_this3 {
    int size;
    This3(int size){
        this.size=size;
    }
    This3(){
        this(10);
    }
    void display(){
        System.out.println("Box size: "+ size);
    }

 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    new _031_this3(sc.nextInt()).display(); 
    sc.close();
 }   
//  error:

}
