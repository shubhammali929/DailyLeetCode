public class ArrayProblem {
    public static int[] generateArray(int n, int k)
    {
        int temp = n;
        int[] arr = new int[k];
        for(int i=1; i<=k; i++){
            if(i%2==0){
                arr[i-1] = temp - i; // i-1 because for loop starts with 1 nd indexing starts with 0
                temp = arr[i-1];
                System.out.println(temp);
            }
            else{
                arr[i-1] = temp + i;
                temp = arr[i-1];
                 System.out.println(temp);
            }
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] result = generateArray(3,2 );
        // printArr(result);
    }
}
