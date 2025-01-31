import java.util.Scanner;

public class _014_DoWhile {
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        int a;


        do { 
            System.out.println("Enter number");
            a=sc.nextInt();
            
            if(a<=0){
                System.out.println("Invalid Number. Try Again!!");
            }

        } while (a<0);
        System.out.println("Number" +a+ " Entered!");

    }
}
