public class checkPalindrome {
    public static void checkPalindrome(int num){
        int res = 0;
        int originalNum = num;
        while(num>0){
            int rem = num%10;
            res = res*10 + rem;
            num/= 10;
        }
        if(originalNum == res)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
        
    }
    public static void main(String[] args) {
        checkPalindrome(11211);
    }
}
