// pending ...
// Solved ..✔️
public class FindFirstAndLastPositionOfElement34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr2 = {0,0};
        if(nums.length == 1 && nums[0]==target)
            return arr2;
        int start = -1;
        int end = -1;
        for(int i=0; i<nums.length; i++){
            if(start == -1 && nums[i] == target)
                start = end=i;
            else if(start != -1 && nums[i]==target)
                end = i;
        }
        int[] arr = {start, end};
        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = {5, 7, 7, 8, 8, 10};
        int[] arr = {1,3};
        int[] res = searchRange(arr, 1);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }
}
