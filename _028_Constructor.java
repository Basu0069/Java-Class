// Consttructor overloading(Parametrizedx Constructor)
// Ques : concatenate 1. integer, string and integer values 
// 2: Integer values
// You have to take user input 

import java.util.Scanner;



    class Concatenator{
        private String result;

        public Concatenator(int a,String b, int c){
            result= a+b+c;
        }
        public Concatenator(int a, int b){
            result= a+ "" +b;
        }

        public void display(){
            System.out.println("Result: "+ result);
        }
        }


public class _028_Constructor {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter first integer:  ");
     int num1 = sc.nextInt();
     sc.nextLine();

        System.out.println("Enter string ");
        String a= sc.nextLine();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        new Concatenator(num1,a,num2).display();
        

        System.out.println("Enter two integers: ");
        new Concatenator(sc.nextInt(),sc.nextInt()).display();
        sc.close();

    }
}
