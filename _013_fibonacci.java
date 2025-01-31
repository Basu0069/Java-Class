import java.util.Scanner;

public class _013_fibonacci {
 public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int first = 0;
    int second = 1;
    
    for(int i =0;i<a;i++){
        int sum= first+second;
        System.out.println(sum);
        first=second;
        second= sum;

 }   
 }
}

