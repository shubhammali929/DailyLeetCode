public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1=nums2;
            return;
        }
        m--;
        n--;
        for(int i=nums1.length-1; i>0; i--)
        {
            // System.out.println("nums1["+m+"]  nums2["+n+"]");
            if(nums1[m]<nums2[n]){
                nums1[i] = nums2[n];
                n--;
            }
            else{
                nums1[i] = nums1[m];
                m--;
            }
        }
        for(int i=0; i<nums1.length; i++)
        {
            System.out.print(nums1[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int[] nums1 = {1,2,3,0,0,0};
        // int[] nums2 = {2,5,6};
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1,0,nums2,1);
    }
}
