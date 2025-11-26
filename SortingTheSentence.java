public class SortingTheSentence{
    public static void main(String[] args){
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
      static String sortSentence(String s) {
        String[] parts = s.split(" ");
        String[] result = new String[parts.length];

        for(String word : parts){
            //last character of every string is the position in the sentence
            int pos = word.charAt(word.length() - 1) - '0';
            //'0' is used to get the actual position in integer as it is '1' in ascii 49 and '0' is 48 in ascii so 49 - 48 is 1
            result[pos - 1] = word.substring(0,word.length() - 1); //to extract the string without the number
        }
        return String.join(" ",result);
    }
}