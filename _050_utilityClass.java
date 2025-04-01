/**
 * Method to calculate factorial 
 * 1. Create a class 
 * 2.Define mwethod bod for factorial in that 
 * 3. Print final solution in main method
 * 
 */


class mth{
    static int factorial(int n){
        return(n<=1) ? 1:n*factorial(n-1);
    }
}

public class _050_utilityClass {
    public static void main(String[] args) {
        System.out.println("Factorial: "+ mth.factorial(8));
        
    }
}
