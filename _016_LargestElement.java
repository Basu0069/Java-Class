
// FOr finding the largest element in the array 
public class _016_LargestElement {
    public static void main(String[] args) {
        int arr[] = {4, 2, 9, 6, 1};

        int largest = arr[0]; // Assume the first element is the largest

        for (int i = 1; i < arr.length; i++) {  // Start loop from the second element
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
