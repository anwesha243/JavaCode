class NumberOfGoodPair {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,1,3};
        System.out.print("The number of good pairs are : "+numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    s++;
                }
            }
        }
        return s;
    }
}
