// A pangram is a sentence where every letter of the English alphabet appears at least once.
public class PangramSentence {
   public static void main(String[] args){
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    System.out.println("The sentence is pangram : "+checkIfPangram(sentence));
   }
    static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        
        // Check if all 26 letters are present
        for (boolean b : seen) {
            if (!b) return false;
        }
        
        return true;
    }
}
