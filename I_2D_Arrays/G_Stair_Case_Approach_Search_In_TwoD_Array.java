public class G_Stair_Case_Approach_Search_In_TwoD_Array {

    public static boolean Stair_Case_Search (int matrix[][], int key) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Element found at (" + row + "," + col + ")");
                return true;
            }
            else if (matrix[row][col] > key) {
                col--;   // move left
            }
            else {
                row++;   // move down
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

        if (!Stair_Case_Search(matrix, key)) {
            System.out.println("Element not found");
        }
    }
}
