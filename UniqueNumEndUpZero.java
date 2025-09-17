import java.util.Arrays;
public class UniqueNumEndUpZero {
   public static void main(String[] args){
    int n = 5;
    System.out.print("The array is : "+Arrays.toString(sumZero(n)));
   } 
     static int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;

        // Add pairs (1, -1), (2, -2), ...
        for (int i = 1; i <= n / 2; i++) {
            ans[index++] = i;
            ans[index++] = -i;
        }

        // If n is odd, add a zero
        if (n % 2 != 0) {
            ans[index] = 0;
        }

        return ans;
    }
}
