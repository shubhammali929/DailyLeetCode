public class ArraySorting {
    public static int[] bubbleSort(int[] arr){
        // time complexity O(n^2) not optimized
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionSort(int[] arr){
        // time complexity O(n^2)
        for(int i=0; i<arr.length; i++){
            int smallest = Integer.MAX_VALUE;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < smallest){
                    smallest = arr[j];
                }
            }
            arr[i] = smallest;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){

    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,9,4,3,6,2};
        int[] arr2 = bubbleSort(arr1);
        int[] arr3 = selectionSort(arr1);
        printArray(arr2);
        printArray(arr3);
    }
}
