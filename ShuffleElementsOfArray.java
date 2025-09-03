import java.util.Arrays;

public class ShuffleElementsOfArray {
    public static void main(String[] args){
        int nums[] = {2,5,1,3,4,7};
        int n = 3;
        System.out.print("The Shuffled Array is:");
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            arr[index++] = nums[i];     // take x[i]
            arr[index++] = nums[i + n]; // take y[i]
        }
        
        return arr;
    }


}
