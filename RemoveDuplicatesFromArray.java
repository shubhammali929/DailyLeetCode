// UNSOLVED

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(int[] nums) {
        int index=0;
        for(int j=1;j<nums.length;j++){
            if(nums[index]!=nums[j]){
                index++;
                nums[index]=nums[j];
            }
        }
        return index+1;
    }
    public static void printArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int res = removeDuplicates(nums);
        // printArray(res);
        System.out.println(res);

    }
}
