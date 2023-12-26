import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];
        int length = start.length() < end.length() ? start.length() : end.length() ;
        for(int i=0; i< length; i++){
            if(start.charAt(i) == end.charAt(i))
                sb.append(start.charAt(i));
            else
                return sb.toString();
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        String[] arr2 = {"ab", "a"};
        String[] arr3 = {"dog","racecar","car"};
        
        System.out.println(longestCommonPrefix(arr3));
    }
}
