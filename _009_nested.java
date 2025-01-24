
import java.util.Scanner;

public class _009_nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
        
        int a = sc.nextInt();

        if(a>0){
            if(a%5==0){
                System.out.println("It is divisible by 5");
            }
            else{
                System.out.println("It is not divisible by 5");
            }

        }
        else{
            System.out.println("The number is not positive");

        }
    }
	}
