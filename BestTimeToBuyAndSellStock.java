public class BestTimeToBuyAndSellStock {
    public static int maxProfitBruteForce(int[] prices) {
        int max_profit = 0;
        for(int i=0; i<prices.length; i++)
        {
            for(int j=i+1; j<prices.length; j++)
            {
                if(prices[j]-prices[i]>max_profit)
                    max_profit = prices[j]-prices[i];
            }
        }
        return max_profit;
    }
    public static int maxProfitOptimized(int[] prices){
        int minSoFar = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++)
        {
            minSoFar = Math.min(minSoFar, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minSoFar);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfitBruteForce(arr));
        System.out.println(maxProfitOptimized(arr));
    }
}
