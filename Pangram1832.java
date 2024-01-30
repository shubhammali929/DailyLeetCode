public class Pangram1832 {
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;
        for(char c = 'a'; c <= 'z'; c++){
            if(sentence.indexOf(c) < 0) return false;   
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
