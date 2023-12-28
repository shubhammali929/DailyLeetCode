public class MinimumTimeToMakeRopeColourful {
    public static int minCost(String colors, int[] neededTime) {
        int ans = 0;
        for(int i=0; i<colors.length()-1; i++){
            if(colors.charAt(i) == colors.charAt(i+1)){
                // ans += neededTime[i]<neededTime[i+1] ? neededTime[i] : neededTime[i+1];
                if(neededTime[i]<neededTime[i+1]){
                    ans+=neededTime[i];

                }else{
                    ans+=neededTime[i+1];
                }
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        String colors = "bbbb";
        int[] arr = {5,4,8,1};
        System.out.println(minCost(colors,arr));
    }
}
