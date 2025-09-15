public class NumbersWithEvenDigits {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.print("The numbers having even number of digit is: "+findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int d = 0;
        int x = 0;
        for(int i =0;i<nums.length;i++){
            int n = nums[i];
            int c = 0;
            while(n>0){
                int rem = n%10;
                n = n/10;
                c++;
                x = c;
                
                }
             if(x % 2 == 0){
                   d++;
            } 
        }
        return d;
    }
}

