import java.util.Arrays;
public class MatrixTranspose {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The Matrix is : "+Arrays.deepToString(matrix)); //for printing 2d arrays deepToString used , tostring will print memory addresses in case of 2d arrays.
        System.out.println("The Transpose Matrix is : "+Arrays.deepToString(transpose(matrix)));
    }
       static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transp = new int[col][row];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                transp[j][i] = matrix[i][j];
            }
        }
        return transp;
    }
}
