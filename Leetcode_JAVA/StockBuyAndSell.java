//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class StockBuyAndSell{
    public static void main(String[] args) {
        // System.out.println("Hello World");
        int []prices={3,2,6,5,0,3};
        //Brute force approach n^2 complexity
        stockBuyAndSell(prices);
        //Optimal approach
        stockBuyAndSells(prices);
    }

    private static void stockBuyAndSells(int[] prices) {
        
        int min_val=Integer.MAX_VALUE;
        int max_profit=0;
        for (int i = 0; i < prices.length; i++) {

            if(prices[i]<min_val){
                min_val=prices[i];
            }else if(prices[i]-min_val > max_profit){
                max_profit= prices[i]-min_val;
            }
        }

    }

    private static void stockBuyAndSell(int[] prices) {
        int maxSum=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]>prices[i]){
                    maxSum=Math.max(prices[j]-prices[i],maxSum);
                }
                
            }
            
        }
        System.out.println(maxSum);
    }
}