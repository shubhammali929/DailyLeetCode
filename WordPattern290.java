import java.util.*;

public class WordPattern290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) 
            return false;
        Map<Character, String> mp = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(!mp.containsKey(pattern.charAt(i))){
                mp.put(pattern.charAt(i), arr[i]);
                System.out.println(mp);
            }
            else{
                if(! mp.get(pattern.charAt(i)).equals(arr[i]))
                    return false;
            }
        }
        Set<String> st = new HashSet<>(mp.values());
        if(st.size()!=mp.size())
            return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println("------------------------------");
        System.out.println(wordPattern("abba", "dog dog dog dog"));
        System.out.println("------------------------------");
        System.out.println(wordPattern("abc", "dog cat dog"));
    }
    
}