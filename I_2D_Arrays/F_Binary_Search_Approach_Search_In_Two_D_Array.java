import java.util.*;

public class F_Binary_Search_Approach_Search_In_Two_D_Array {

    public static boolean BinarySearch_On_2D_Array(int matrix[][], int key) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == key) {
                System.out.println("Element found at index: (" + r + "," + c + ")");
                return true;
            }
            else if (matrix[r][c] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int key = 16;

        if (!BinarySearch_On_2D_Array(matrix, key)) {
            System.out.println("Element not found");
        }
    }
}
