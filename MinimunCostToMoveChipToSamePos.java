public class MinimunCostToMoveChipToSamePos {
    public static void main(String[] args) {
        int[] position = {1,2,3};
        System.out.print("POS : "+minCostToMoveChips(position));
    }
        static int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount = 0;
        
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        return Math.min(oddCount, evenCount);
    }
}
