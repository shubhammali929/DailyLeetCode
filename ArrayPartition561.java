public class ArrayPartition561 {
    public static int arrayPairSum(int[] nums) {
        int sum=0;
        java.util.Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {6,2,6,5,1,2}; //[1,2,2,5,6,6] after sorted -> [min(1,2) + min(2,5) + min(6,6)]
        System.out.println(arrayPairSum(arr));
    }
}
