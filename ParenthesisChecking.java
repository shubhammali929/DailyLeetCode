import java.util.Stack;

public class ParenthesisChecking {
    public static boolean checkParanthesis(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                st.add(str.charAt(i));
            }
            if(str.charAt(i)==')' ){
                if(st.peek()=='(')
                    st.pop();
                else
                    return false;
            }else if(str.charAt(i) == ']' )
                if (st.peek()=='[') 
                    st.pop();     
                else
                    return false;           
            else if(str.charAt(i) == '}' )
                if (st.peek()=='{')
                    st.pop();
                else
                    return false;
            
            
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(checkParanthesis("({()})"));
    }
}
