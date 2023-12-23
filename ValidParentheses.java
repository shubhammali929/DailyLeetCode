import java.util.Stack;

public class ValidParentheses {
    public static boolean checkParenthesis(String str){
        if(str.length()==1)
            return false;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            if(c==')' || c=='}' || c==']'){
                if(st.isEmpty())
                    return false;
                if(c==')'  && st.peek() == '(')
                    st.pop();
                else if(c=='}'  && st.peek() == '{')
                    st.pop();
                else if(c==']'  && st.peek() == '[')
                    st.pop();
                else
                    return false;
                
            }
                
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(checkParenthesis("){"));
    }
}
