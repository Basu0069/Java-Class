import java.util.Scanner;

public class _017_InsertionArray {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();

            int[] array= new int[size];
        System.out.println("Enter "+ size + " elements");
        for(int i=0;i<size;i++){
            System.out.println("Elements "+(i+1)+" : ");
            array[i]=sc.nextInt();
        }
        System.out.println("The entered array is : ");
        for(int num: array){
            System.out.print(num + " ");
        }
    }
}
