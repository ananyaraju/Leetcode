class Solution
{
    public int maxProfit(int[] prices)
    {
        int profit = 0;
        int buy = prices[0];
        int temp = 0;
        for (int price: prices)
        {
            if (price < buy)
            {
                buy = price;
            }
            temp = price - buy;
            if (profit < temp)
            {
                profit = temp;
            }
        }
		return profit;
    }
}