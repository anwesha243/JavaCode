import java.util.Arrays;

public class SmallerCount{
    public static void main(String[] args){
        int[] nums = {8,1,2,4,5,6};
        System.out.println("Smaller number:");
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int c = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    c++;
                }
                arr[i] = c;
            }
        }
        return arr;
    }

}