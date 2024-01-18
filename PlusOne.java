public class PlusOne {
    public static int[] plusOne1(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] digits2 = new int[digits.length+1];
        digits2[0]=1;
        return digits2;
    }
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9};
        printArr(plusOne1(arr));

        int[] arr3 = {1,3,5};
        printArr(plusOne1(arr3));

        int[] arr2 = {9,9};
        printArr(plusOne1(arr2));
    }
}
