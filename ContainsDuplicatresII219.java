import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatresII219 {
    // brute Force ...
    /*public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                    if(Math.abs(i-j) <= k)
                        return true;
            }
        }
        return false;
    }*/

    // optimised Method
    public boolean containsNearbyDuplicate(int[] nums, int k){
        Map<Integer, Integer> hsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!hsMap.containsKey(nums[i]))
                hsMap.put(nums[i], i);
            else{
                if(Math.abs(hsMap.get(nums[i]) - i) <= k)
                    return true;
                else
                    hsMap.replace(nums[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicatresII219 obj = new ContainsDuplicatresII219();
        int[] arr = {1,2,3,1};
        System.out.println(obj.containsNearbyDuplicate(arr, 3));
    }
}
