import java.util.*;
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> mp  = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int res = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(i==s.length()-1){
                res+=mp.get(s.charAt(i));
                return res;
            }
            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i+1)))
                res -= mp.get(s.charAt(i));
            else
                res+= mp.get(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
