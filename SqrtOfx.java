
public class SqrtOfx{
    public static void main(String[] args) {
        int x =4;
        System.out.print("The sqrt of x is : "+mySqrt(x));
    }
    static int mySqrt(int x) {
        if (x < 2){
            return x;
        }

        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;  // use long to avoid overflow
            long sq = mid * mid;

            if (sq == x) {
                return (int) mid;
            }
            if (sq < x) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return ans;
    }
}