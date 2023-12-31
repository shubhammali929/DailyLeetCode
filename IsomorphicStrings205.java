import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(! mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),t.charAt(i));
            }else{
                if(mp.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
        }
        // System.out.println(mp);
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("Apple","Alljq"));
    }
}
