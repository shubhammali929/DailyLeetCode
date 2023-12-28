// UNSOLVED
public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for(int i=0; i<nums.length-1; i++)
        {
            if(i==nums.length-2){
                arr[index] = nums[i+1];
                index++;
            }//for last two numbers
            if(nums[i]==nums[i+1])
                continue;
            else{
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }
    public static void printArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int[] res = removeDuplicates(nums);
        printArray(res);

    }
}
