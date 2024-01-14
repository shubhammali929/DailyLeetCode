//pending
import java.util.ArrayList;
import java.util.List;

class Permutations46{
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> lst = new ArrayList<>();
            lst.add(nums[i]);
            for(int j=0; j<nums.length; j++){
                if(i != j)
                    lst.add(nums[j]);
            }
            ans.add(lst);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }
}