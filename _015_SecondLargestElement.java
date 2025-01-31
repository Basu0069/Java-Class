import java.util.Arrays;

public class _015_SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {4, 2, 9, 6, 1};

        if (arr.length < 2) {
            System.out.println("Enter at least 2 elements.");
            return;
        }

        Arrays.sort(arr); // Sort the array in ascending order

        System.out.println("Second largest element is: " + arr[arr.length - 2]);
    }
}
