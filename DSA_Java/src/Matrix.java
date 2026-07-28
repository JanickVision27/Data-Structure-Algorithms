import java.util.Arrays;

public class Matrix {

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Count values in a Matrix
    public static int PrintMatrix(int[][] matrix) {
        int finalCount = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                finalCount += matrix[r][c];
            }
        }

        return finalCount;

    }

    // checking if a value is matching a target
    public static int countTarget(int[][] matrix, int target) {
        int finalCount = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == target) {
                    finalCount += 1;
                }
            }
        }

        return finalCount;
    }

    public static void reverseRow(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left += 1;
            right -= 1;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void transpose(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int r = 0; r < n; r++) {
            for (int c = r + 1; c < n; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }

        // the reverse the matrix
        for(int r = 0; r < n; r++){
            int left = 0;
            int right = n - 1;

            while(left < right){
                int temp = matrix[r][left];
                matrix[r][left] = matrix[r][right];
                matrix[r][right] = temp;
                left++;
                right--;
            }
        }
    }

    

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        transpose(matrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(matrix);

    }

}
