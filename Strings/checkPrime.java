public class checkPrime {
    public static boolean checkPrime(int num){
        boolean flag = true;
        for(int i=2; i<num/2; i++){
            if(num%i == 0)
                return false;
                  
        }
        return true;
    }
    public static boolean checkPrime2(int num, int i){
        if (i > num/2)
            return true;
        if(num%i == 0)
            return false;
        i++;
        return checkPrime2(num, i);
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(5));
        System.out.println(checkPrime2(8,2));
    }
}
