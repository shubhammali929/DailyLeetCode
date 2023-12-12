// Java Program to replace a character with it's occurance in given string eg.Reolacing T in: OPENTEXT->OPEN1EX2
public class ReplaceWithOccurance {
    public static void replace(String str, char ch){

        StringBuffer sb = new StringBuffer();
        if(!str.contains(ch+"")){
            System.out.println("No Such character found in the string");
            return;
        }
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                sb.append(count+1);
                count++;
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        replace("Hello", 'l');
    }
}
