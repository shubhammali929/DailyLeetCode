import java.util.ArrayList;
import java.util.List;

public class PossiblePalindrome {
    //Asked in Wisdm Labs
    public static boolean isPalindrome(String str){
    // return str.equals(new StringBuilder(str).reverse().toString());
        for(int i=0; i<str.length()/2; i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i))
            return false;
        }
         return true;
    }

    public static List<String> findPalindromePairs(List<String> arr) {

        List<String> result = new ArrayList<>();

        for(int i=0; i< arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++){
                String concatenated = arr.get(i) + arr.get(j); 
                
                if(isPalindrome(concatenated))
                    result.add(concatenated); 

                concatenated = arr.get(j)+arr.get(i); 
                if(isPalindrome(concatenated))
                    result.add(concatenated); 
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("aab");
        lst.add("baa");
        // lst.add("hello");
        // lst.add("world");
        System.out.println(findPalindromePairs(lst));
    }
}
