public class RotateArray189{
    public static void rotate(int[] nums, int k) {
        for(int i=0; i<k; i++)
        {
            int temp = nums[0];
            nums[0] = nums[nums.length-1];
            nums[nums.length-1] = temp;
            for(int j=1; j<nums.length-1; j++)
            {
                nums[j] = nums[j+1];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = 
    }
}