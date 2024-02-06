public class checkArmstrong {
    public static void checkArmstrong(int n){
        int sum =0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n /= 10;
        }
        if(temp == sum)
            System.out.println("Number is armstrog");
        else
        System.out.println("Not a armstrog number");
    }
    public static void main(String[] args) {
        checkArmstrong(372);
    }
}
