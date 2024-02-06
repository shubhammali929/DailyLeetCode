public class Recursion {
    public static void print1to10(int num){
        if(num==0)   
            return;
        System.out.println(num);
        print1to10(num-1);
        
    }
    public static void calcSum(int i, int n, int sum){
        if(i>n){ //base condition
            System.out.println("Sum of first "+n+" natural numbers is : "+sum);
            return;
        }
        sum += i;
        calcSum(i+1, n, sum);
    }
    public static void printFactorial(int i, int n, int fact){
        if(i==1){
            System.out.println("Factorial of " + n+" is : "+ fact);
            return;
        }
        fact*= i;
        printFactorial(i-1, n, fact);

    }
    public static int printFactorial2(int n){
        if(n==1)
            return 1;
        return n*printFactorial2(n-1);
    }
    public static void printFibSeries(int a, int b,int n){

        if(n==0)
            return;
        int c = a+b;
        System.out.println(c);
        printFibSeries(b,c,n-1);

    }
    public static int calcPower(int n, int p){
        if(p==0 || n==0)
            return 1;
        return n* calcPower(n, p-1);
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
        // print1to10(4);
        // calcSum(0, 3, 0);
        // printFactorial(5, 5, 1);
        // System.out.println(printFactorial2(3));
        // printFibSeries(0,1,9);
        // System.out.println(calcPower(2, 5));
        System.out.println(checkPrime2(24, 2));

    }
}
