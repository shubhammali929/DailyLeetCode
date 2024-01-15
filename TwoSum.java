import java.util.*;

public class TwoSum {
    public static void twoSum(int[] nums, int target) {
        int num1=-1;
        int num2=-1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])){
                num1 = nums[i];
                num2 = target-nums[i];
            }else
                map.put(nums[i], i);

            
        }
        System.out.println(num1+" "+num2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        twoSum(arr, 6);
    }
}
