
public class _018_RotatingArray {
    public static void main(String[] args) {
        
        // |1 2 |   to     |1 3 |   to |3 1 |
        // |3 4 |          |2 4 |      |4 2 |


        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int n = matrix.length;
        int[][] rotated = new int[n][n];


        





















        // Rotate 90 degrees (clockwise)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        // Print the rotated matrix
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        } 



    }
}



// You can do this question with transpose first too. and then swap case do this with that too 