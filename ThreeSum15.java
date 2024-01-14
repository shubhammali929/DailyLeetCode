// pending 
import java.util.*;
public class ThreeSum15 {
    public static void threeSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j= 0; j<nums.length; j++)
            {
                for(int k= 0; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0 && i!=j && j!=k && i!=k){
                        System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        threeSum(arr);
    }
}
