import java.util.*;
class TheMysteriousPalindrome {
    // Asked in WisdmLabs
    public static String can_form_palindrome(String random_string){

        Map<Character, Integer> charCount = new HashMap<>();

        for(char c : random_string.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }
        int oddCount = 0;
        for(int count: charCount.values()){
            if(count%2 != 0){
                oddCount++;
            }
        }
        return (oddCount <= 1) ? "Possible to form palindrome" : "Not possible to form palindrome";

    }
    public static void main(String[] args) {
        System.out.println(can_form_palindrome("vicci"));
    }
}
