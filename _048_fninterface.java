/**
 *Create a functional Interface that checks if student passes of fails 
 1.Create an interface with method 
 2. Define that method using lambda Expression in main method 
 */

 interface grading{
    String marks(int score);
 }



public class _048_fninterface {
    public static void main(String[] args) {


        grading grade = score -> score >= 50? "Pass": "Fail";
        System.out.println("Result: "+ grade.marks(65));

        



    }
}





