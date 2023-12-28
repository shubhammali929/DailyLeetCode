public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
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
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
