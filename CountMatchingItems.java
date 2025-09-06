import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatchingItems {
    public static void main(String[] args){
        List<List<String>> items = new ArrayList<>(
            Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
            )
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.print("Number of matches :"+countMatches(items,ruleKey,ruleValue));

    }
      static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        int index = 0;
        if(ruleKey.equals("type")){
            index = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else if(ruleKey.equals("name")){
            index = 2;
        }

        for(int i =0;i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
              c++;
            }
        }
        return c;
    }
}
