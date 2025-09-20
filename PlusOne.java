import java.util.Arrays;
public class PlusOne{
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.print("The incremented array is : "+Arrays.toString(plusOne(digits)));
    }
        static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[len + 1];
        result[0]=1;
        return result; 
    }
}