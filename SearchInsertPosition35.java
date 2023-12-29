public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1])
            return nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 5));
    }
}
