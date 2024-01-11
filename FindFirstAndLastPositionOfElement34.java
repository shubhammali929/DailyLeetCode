// pending ...
public class FindFirstAndLastPositionOfElement34 {
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        int i = 0;
        int j = nums.length - 1;
        int count = 1;
        while (count <= nums.length) {
            // Added braces for better structure
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                } else {
                    i++;
                }
            }

            // Added braces for better structure
            if (nums[j] == target) {
                if (end == -1) {
                    end = j;
                } else {
                    j--;
                }
            }

            count++;
        }
        int[] res = {start, end};
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] res = searchRange(arr, 8);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }
}
