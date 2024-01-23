public class LeetCode_121
{
    public static int maxProfit(int[] prices)//if you could buy once
    {
        int buy=Integer.MAX_VALUE,sell=0;
        for(int i=0;i<prices.length;i++)
        {
            buy= Math.min(buy,prices[i]);
            sell= Math.max(sell,prices[i]-buy);
        }
        return sell;
    }
    public static int maxProfit2(int prices[])//if you could buy & sell many times
    {
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
                profit+=prices[i]-prices[i-1];
        }
    return profit;
    }
    public static void main(String[] args) {
        
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Original array");
        for(int num:prices1)
            System.out.print(num+" ");
        System.out.println();
        System.out.println("When you can buy and sell once");
        
        int result1 = maxProfit(prices1);
        System.out.println("Maximum profit (buy once): " + result1);
        System.out.println("When you can buy and sell multiple times");

        int[] prices2 = {7, 1, 5, 3, 6, 4};
        int result2 = maxProfit2(prices2);
        System.out.println("Maximum profit (buy and sell many times): " + result2);
    }
}