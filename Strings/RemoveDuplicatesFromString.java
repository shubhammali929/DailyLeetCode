import java.util.*;
public class RemoveDuplicatesFromString {
    public static void removeDuplicateWords(String str){
        String[] strArray = str.split(" ");
        Set<String> set = new LinkedHashSet<String>();
        for(int i=0; i<strArray.length; i++){
            set.add(strArray[i]);
        }
        System.out.println("The string after removing duplicates is : "+String.join(" ",set));

    }
    public static void removeDuplicateChars(String str){
        char[] chArray = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<chArray.length; i++){
            set.add(chArray[i]);
        }
        System.out.println(set);
    }
    
    public static char findMaxOccr(String str){
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        char maxOccr = str.charAt(0);
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i), map.get(str.charAt(i))+1);
                if(map.get(str.charAt(i))>maxCount) {
                    maxCount=map.get(str.charAt(i));
                    maxOccr=str.charAt(i);
                }
            }
            else
                map.put(str.charAt(i), 1);
        }
        return maxOccr;
        

    }
    
    public static void main(String[] args) {
        removeDuplicateWords("hello Hello as Hello");
        removeDuplicateChars("asdasdnfdsjfva");
        System.out.println(findMaxOccr("javaprogramming"));
    }
}
