import java.util.Scanner;
public class ara {
    public static void main(String[] args) {
        
        int [][] array={{1,2,3},{4,5,6},{7,8,9}};
        int n= array.length;

        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                int temp= array[i][j];
                array[i][j]= array[j][i];
                array[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp =array[i][j];
                array[i][j]=array[i][n-1-j];
                array[i][n-1-j]=temp;

            }

            for(int [] row: array){
                for(int val:row){
                    System.out.println(val +" ");
                }
                System.out.println();
            }
        }
    }
}
