public class swapWithoutThirdVar {
    public static void swapNums(int a, int b){
        a = a+b; // a = 2+4 = 6
        b= a-b; // b = 6-4 = 2
        a = a-b; // a = 6-2 = 4
        System.out.println("a : "+a+" b: "+b);
    }
    public static void main(String[] args) {
        swapNums(2, 4);
    }
}
