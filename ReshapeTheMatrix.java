import java.util.Arrays;
public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        System.out.print("The reshaped matrix is : "+Arrays.deepToString(matrixReshape(mat, r, c)));

    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat; // return original matrix
        }

        int[][] res = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = mat[i][j];
                col++;
                if (col == c) {  // move to next row
                    col = 0;
                    row++;
                }
            }
        }

        return res;
    }
}

