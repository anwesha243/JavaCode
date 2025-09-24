public class GoodArray{
    public static void main(String[] args) {
        int[] nums = {12,5,7,23};
        System.out.print("The given array is a good array : "+isGoodArray(nums));
    }
    static boolean isGoodArray(int[] nums) {
        int g = nums[0];
        for (int i = 1; i < nums.length; i++) {
            g = gcd(g, nums[i]);
            if (g == 1) {
                return true; // Early exit since gcd can't get smaller
            }
        }
        return g == 1;
    }
    
    // Euclidean Algorithm for gcd
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}