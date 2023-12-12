import java.util.Stack;

class ReverseSentence{
    // public String reverseWords(String s) {

    // }
    public static void main(String[] args) {
        System.out.println("HEllo");
        String Sentence = "This is";
        String newSentence = "";

        int start = Sentence.length()-1;
        int end = 0;
        Stack<String> st = new Stack<>();
        for(int i=Sentence.length()-1; i>=0; i--)
        {
            int j=i;
            while(Sentence.charAt(j)!=' '){
                j++;
            }
            
            if(Sentence.charAt(i) == ' '){
                end = i+1;

            }
            st.push(Sentence.substring(start, end));
            start = i;
            
        }
        System.out.println("End");
        System.out.println(st);
    }
}