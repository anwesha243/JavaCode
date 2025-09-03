

//Question Link : https://leetcode.com/problems/richest-customer-wealth/

public class RchestManWealth {
    public static void main(String[] args){
      int[][] accounts = {{1,2,3},{3,2,1},{4,3,6}};
      int richestManW = maximumWealth(accounts);
      System.out.print("The Richest Man Wealth is "+richestManW);
    }
    static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int maxW = 0;
        for(int r = 0;r<n;r++){
            int csum = 0;
            for(int c = 0; c <= accounts[r].length - 1;c++){
                csum = csum + accounts[r][c];
                if(csum > maxW){
                    maxW = csum;
                }
            }
        }
        return maxW;
    }
}

