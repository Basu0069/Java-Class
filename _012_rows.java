import java.util.Scanner;

public class _012_rows {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows");
        int a = sc.nextInt();
        System.out.println("enter column");
        int b = sc.nextInt();

        for(int i = 0;i<a;i++){
            for(int j = 0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
