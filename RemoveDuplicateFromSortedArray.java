
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,4};
        int k = removeDuplicates(nums); // Calls your implementation
        System.out.print(k);
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {  // found a new unique element
                i++;
                nums[i] = nums[j];     // move it to the next unique slot
            }
        }

        return i + 1; // number of unique elements
    }
}

