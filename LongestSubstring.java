// write a java program to find longest substring which doesn't contain repearting characters in goven string 
// eg. abbbac -> bac  legnth->3
public class LongestSubstring {
    public static void findLongestSubstring(String str){
        int longestString = 0;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++){
                for(int j=i; j<str.length(); j++){
                    if( sb.indexOf(str.charAt(j)+"") < 0){
                            sb.append(str.charAt(j));
                    }else{
                        if(sb.length() > longestString){
                            longestString = sb.length();
                            break;
                        }
                        break;
                    }
                }
        }
    }
     public static void main(String[] args) {
        
     }
}
