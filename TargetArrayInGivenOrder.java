import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TargetArrayInGivenOrder {
    public static void main(String[] args){
        int[] nums ={0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println("Target array : ");
        System.out.print(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] arr = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}

