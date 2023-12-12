public class ReverseEachWord {
    public static void reverse(String str){
        String[] words = str.split(" ");
        for(int i=0; i<words.length; i++){
            for(int j=words[i].length()-1; j>=0; j--){
                    System.out.print(words[i].charAt(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        reverse("Hello this is a string");
    }
}
