public class ReverseString {
    public static void reverse1(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void reverse2(String str){
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1.reverse());
    }
    public static void reverse3(String str){
        StringBuffer sb2 = new StringBuffer(str);
        System.out.println(sb2.reverse());
    }
    public static void main(String[] args) {
        String name = "Shubham";
        reverse1(name);
        reverse2(name);
        reverse3(name);
    }
}
