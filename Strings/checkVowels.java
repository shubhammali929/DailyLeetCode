public class checkVowels {
    public static boolean checkVowels(String str){
        if(str.toLowerCase().matches(".*[aeiou].*"))
            return true;
        else    
            return false;
    }
    public static void main(String[] args) {
        System.out.println(checkVowels("Shubham"));
    }
}
