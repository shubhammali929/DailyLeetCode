public class PlusOne {
    public static int[] plusOne1(int[] digits) {
        int carry = 0;
        if(digits.length==1 && digits[0]==9){
            int[] digits2 = {1,0};
            return digits2;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry == 1) {
                digits[i]++;
                carry = 0;
            }
            if(i==digits.length-1 && digits[i] != 9){
                digits[i]++;
            }
            if(i==digits.length-1 && digits[i]==9){
                carry = 1;
                digits[i] = 0;
            }
            
        }
        return digits;
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
