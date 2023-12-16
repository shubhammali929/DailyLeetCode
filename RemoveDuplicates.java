import java.util.*;
//Asked in WisdomLabs
public class RemoveDuplicates {

// Complete the 'removeDuplicates' function below.
// The function is expected to return an STRING.
// The function accepts STRING ARRAY names as parameter.
    public static String removeDuplicates (List<String> names) {
        HashSet<String> uniqueNames = new LinkedHashSet<>(names);
        StringBuilder result = new StringBuilder();
        for(String name: uniqueNames){ 
            result.append(name).append(",");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Alex Morgan");
        lst.add("john doe");
        lst.add("james smith");
        lst.add("john doe");
        lst.add("Sophia Smith");
        lst.add("Rose Lavelle");
        lst.add("Alex Morgan");
        System.out.println(removeDuplicates(lst));
    }
}
