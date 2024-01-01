import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(! mp.containsKey(s.charAt(i))){
                if(! mp.containsValue(t.charAt(i)))
                    mp.put(s.charAt(i),t.charAt(i));
                else
                    return false;
            }else{
                if(mp.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }   
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
