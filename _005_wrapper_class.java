
import java.util.Scanner;

public class _005_wrapper_class {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int prValue = sc.nextInt();


        Integer wrapperObject= prValue;

        System.out.println("Original Primitive Value :" + prValue);

        System.out.println("Wrapper Object Value: "+ wrapperObject);


        sc.close();
        

        

    }
}
