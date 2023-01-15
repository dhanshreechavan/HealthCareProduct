/* here buy variable to store buy cost and maxprofit to store maximum profit .
 *to increase profit we have to sell at max price and buy at min price.
*here if current price is minimum then buy on ith day.
*if price is greater than previous buy then make profit and maximize profit 
and return maxprofit.
*/
package com.assignment;
public class BestTimeToSellAndBuy {

	public static int maximumprofit(int prices[],int n) {
		
		int buy=prices[0],max_profit=0;
		for(int i=1;i< n;i++) 
		{
			if(buy > prices[i])
				buy = prices[i];
			else if(prices[i]-buy > max_profit)
				max_profit = prices[i]-buy ;
		}
	return max_profit;
	}
	public static void main(String[] args)
{
    int prices[]= {7,1,5,3,6,4}; //buy on day 2 and sell on day 2 profit is 5
    //int prices[]= {7,6,4,3,1};// in this case no transaction is done max profit is zero
    int n=prices.length;
	int max_profit = maximumprofit(prices,n);
	System.out.println(max_profit);
	
	
}
}
