// pending 
import java.util.*;
public class ThreeSum15 {
    // public static void threeSum(int[] nums) {
    //     Set<String> set = new HashSet<>();
    //     for(int i=0; i<nums.length; i++){
    //         for(int j= i+1; j<nums.length; j++)
    //         {
    //             for(int k= j+1; k<nums.length; k++){
    //                 if(nums[i]+nums[j]+nums[k] == 0 && !set.contains(nums[i]+""+nums[j]+""+nums[k])){
    //                     System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
    //                     set.add(nums[i]+""+nums[j]+""+nums[k]);
    //                 }
    //             }
    //         }
    //     }
    //     System.out.println(set);
    // }
    public static void threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int indexValue = map.get(nums[i]);
                map.replace(nums[i], indexValue+1);
            }else{
                map.put(nums[i], 1);
            }
            int curr = nums[i];
            for(int j=i+1; j<nums.length; j++){
                int next = nums[j];
                if(map.containsKey(-(curr+next)))
                    System.out.println(nums[i]+""+nums[j]+""+-(curr+next));
            }


        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        threeSum(arr);
    }
}
