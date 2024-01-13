class ConcatenationOfArray1929{
    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int[] res = getConcatenation(arr);
        for(int i=0; i<res.length; i++)
            System.out.print(res[i]+" ");
    }
}