// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        if(Arrays.equals(arr1, arr2))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
