// Question 2 nos as user i/p. Create methods of add and multiply & printer.
// 1.Create method of add 
// 2.Create Multiply method
// 3.call multiply method in add using this 
// 4.Call only add method in main 

import java.util.Scanner;

public class _030_this2 {

void add(int a, int b){
    System.out.println("ADD: "+ (a+b));
    this.multiply(a,b);
}
void multiply(int a, int b){
    System.out.println("Multiply:"+ (a*b));
}


    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

//   Here i called object without creating the class 
  new _030_this2().add(sc.nextInt(),sc.nextInt());
  sc.close();

    }
}
