public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        if(! str.contains(" "))
            return str.length();
        int count =0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)==' '){
                return count;
            }else{
                count++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World  "));
        System.out.println(lengthOfLastWord("aa"));
    }
}
