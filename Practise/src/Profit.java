class Profit
{
    // Returns maximum profit with two transactions on a given
    // list of stock prices, price[0..n-1]
    static int maxProfit(int price[], int n)
    {
        // Create profit array and initialize it as 0
        int profit[] = new int[n];
        for (int i=0; i<n; i++)
            profit[i] = 0;
        	
      
        /* Get the maximum profit with only one transaction
           allowed. After this loop, profit[i] contains maximum
           profit from price[i..n-1] using at most one trans. */
        int max_price = price[n-1];
        for (int i=n-2;i>=0;i--)
        {
            // max_price has maximum of price[i..n-1]
            if (price[i] > max_price)
                max_price = price[i];
      
            // we can get profit[i] by taking maximum of:
            // a) previous maximum, i.e., profit[i+1]
            // b) profit by buying at price[i] and selling at
            //    max_price
            profit[i] = Math.max(profit[i+1], max_price-price[i]);
        }
        int result = profit[n-1];
        return result;
     
    }
    
    public static void main(String args[])
    {
        int price[] = {2, 30, 15, 10, 8, 25, 80};
        int n = price.length;
        System.out.println("Maximum Profit = "+ maxProfit(price, n));
    }
 
}