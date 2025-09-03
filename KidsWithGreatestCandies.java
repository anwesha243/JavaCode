import java.util.ArrayList;
import java.util.List;

class kidsWithGreatestCandies {
    public static void main(String[] args){
        int[] candies = {2,3,4,5,1,3};
        int extraCandies = 3;
        System.out.print(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies any kid has
        int maxCandies = 0;
        for (int candyCount : candies) {
            if (candyCount > maxCandies) {
                maxCandies = candyCount;
            }
        }

        // Create a list to store the results
        List<Boolean> result = new ArrayList<>();

        // Check each kid to see if they can have the greatest number of candies
        for (int candyCount : candies) {
            if (candyCount + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}