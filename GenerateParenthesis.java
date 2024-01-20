import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        recurse(lst, n, 0, 0, "");
        return lst;
    }
    public static void recurse(List<String> lst,int n, int openCount, int closeCount, String curr_str){
        //base case
        if(curr_str.length()==n*2){
            lst.add(curr_str);
            return;
        }
        if(openCount<n)recurse(lst, n, openCount+1, closeCount, curr_str+"(");
        if(closeCount<openCount)recurse(lst, n, openCount, closeCount+1, curr_str+")");
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
