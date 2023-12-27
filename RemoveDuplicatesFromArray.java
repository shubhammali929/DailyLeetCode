public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
                continue;
            else{
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        System.out.println(removeDuplicates(nums));

    }
}
