public class secondHighest {
    public static int fndSecondhighest(int[] arr){
        int highest = 0;
        int secondHighest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            }
        }
        return secondHighest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,11};
        System.out.println("The Second Highest Element is : "+fndSecondhighest(arr));
    }
    
}
