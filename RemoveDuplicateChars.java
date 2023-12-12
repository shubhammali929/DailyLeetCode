import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void printStr(String str){
         StringBuilder sb = new StringBuilder();
         str.chars().distinct().forEach(a-> sb.append((char)a));
         System.out.println("Result : "+sb);
    }

    public static void printStr2(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int ind = str.indexOf(c,i+1);
            if(ind<0)
                sb.append(c);
        }
        System.out.println(sb);
    }

    // IMPORTANT
    public static void printStr3(String str){
        StringBuffer sb = new StringBuffer();
        // char[] chArr = str.toCharArray();
        for(int i=0; i< str.length(); i++){

            boolean repeated = false;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j))
                    repeated = true;
            }
            if(!repeated)
                sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

    public static void printStr4(String str){
        StringBuffer sb = new StringBuffer();
        Set<Character> chars = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++){
            chars.add(str.charAt(i));
        }
        for(Character c : chars){
            sb.append(c);
        }
        System.out.println(sb  );
    }
    public static void main(String[] args) {
        printStr("Apple");
        printStr2("Apple");
        printStr3("AAppllele");
        printStr4("APPPlE");
    }
}
