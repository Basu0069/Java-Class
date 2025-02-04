// 1. Way to handle flexible or vairable inputs 
// allows java to accep flexible number of aruguments without creating mutiple overloaded methods

import java.util.Scanner;

public class _020_varargs {
    public static int sum(int... nums){
        int total=0;
        for(int number:nums){
            total+=number;
        }
        return total;
    }
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter Numbers. Saperated by Spaces");
 String input = sc.nextLine();

 String[] inputArray= input.split(" ");

 int[]nums= new int[inputArray.length];
 for(int i=0;i<(inputArray.length);i++){
    nums[i]= Integer.parseInt(inputArray[i]);


 }
 int result= sum(nums);
 System.out.println("Entered number's Sum is : "+ result);
    }
}
