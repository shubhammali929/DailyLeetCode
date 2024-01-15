public class IncreasingTripletSubsequence334 {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > mid)return true;
            else if(nums[i]>left && nums[i]<mid)
                mid=nums[i];
            else if(nums[i]<left)
                left=nums[i];
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(increasingTriplet(arr));
    }
}
