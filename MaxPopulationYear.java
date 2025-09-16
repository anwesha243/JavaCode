public class MaxPopulationYear {
    public static void main(String[] args){
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.print("The earliest year with the maximum population : "+maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int[] years = new int[2051]; // 1950–2050 range (constraint from problem)

        for (int[] log : logs) {
            years[log[0]]++;   // person born -> +1
            years[log[1]]--;   // person died  -> -1
        }

        int maxPop = 0, year = 1950, currPop = 0;

        for (int i = 1950; i <= 2050; i++) {
            currPop += years[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                year = i;
            }
        }

        return year;
    }
}
