import java.util.HashMap;
import java.util.Map;

public class CountCharOccurance {

    public static void count(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch, 1);
            else{
                int cnt = map.get(ch);
                map.put(ch,cnt+1);
            }      
        }
        System.out.println(map);
    }
    
    public static void main(String[] args) {
        count("Hello");
    }
}
