import java.util.*;
public class MjaorityElement169 {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int maxCount = 0;
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1 );
            }else{
                mp.replace(nums[i] , mp.get(nums[i])+1);
                if(maxCount<=mp.get(nums[i])){
                    index = i;
                    maxCount=mp.get(nums[i]);
                }
            }
        }
        System.out.println(mp);
        return nums[index];
    }
    public static void main(String[] args) {
        int[] arr = {6,6,6,7,7};
        System.out.println(majorityElement(arr));
    }
}