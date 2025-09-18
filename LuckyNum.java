   import java.util.*;
public class LuckyNum {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.print("The Lucky number : "+luckyNumbers(matrix));
    }
 
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            // Step 1: Find min in the row and its column index
            int rowMin = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if this rowMin is also the max in its column
            boolean isLucky = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(rowMin);
            }
        }
        return result;
    }
}
