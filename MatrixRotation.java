public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.print("Rotation Matched : "+findRotation(mat, target));
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        
        // Try all 4 rotations
        for (int k = 0; k < 4; k++) {
            if (isSame(mat, target)) return true;
            mat = rotate90(mat);  // rotate mat by 90 degrees
        }
        return false;
    }
    
    // Check if two matrices are identical
    static boolean isSame(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
    
    // Rotate matrix by 90° clockwise
    static int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = mat[i][j];//for rotation
            }
        }
        return res;
    }
}

