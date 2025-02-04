import java.util.Scanner;

public class _019_2d_array {
    public static void main(String[] args) {
        
        // wap to take inputs feom user for all elements of 2d array 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of colums");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // taking inputs:
        System.out.println("Enter elements of array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Elements at ["+i+"]["+j+"]");
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("\nThr 2D array is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
