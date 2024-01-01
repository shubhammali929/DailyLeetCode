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
        Map<Character, Character> mp2 = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(! mp2.containsKey(t.charAt(i))){
                mp2.put(t.charAt(i),s.charAt(i));
            }else{
                if(mp2.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
        }
        // System.out.println(mp);
        // System.out.println(mp2);
        String news ="";
        String news2 = "";
        for(int i=0; i<s.length(); i++){
            news += mp.get(s.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            news2 += mp2.get(t.charAt(i));
        }
        // System.out.println("Result-->"+news);
        // System.out.println("Result2-->"+news2);
        if(news.equals(t) && news2.equals(s))
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
