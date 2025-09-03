public class SplitArrLargestsum {
    public static void main(String[] args){
        int[] nums={7,2,5,10,8};
        int k =2;
        System.out.print("The smallest value of largest sum of subarrays: "+ splitArray(nums,k));
    }
    
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // start = max element, end = sum of all elements
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        // binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                // too many pieces → increase max sum
                start = mid + 1;
            } else {
                // can split into k or fewer pieces → try smaller max sum
                end = mid;
            }
        }

        return start;  // or end (both are equal here)
    }
}

