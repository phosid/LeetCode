class Solution {
    
    //idea is to keep track of two variables while iterating through the indexes
    //always find the lowest price first, then find the highest price after the lowest price
    //O(n) time complexity because we iterate through the entire array
    //O(1) space complexity because we don't create any data structures or another array (only two variables are used)
    
    public int maxProfit(int[] prices) {
        
        int lowestValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestValue) {
                lowestValue = prices[i];
            } else if (prices[i] - lowestValue > maxProfit) {
                maxProfit = prices[i] - lowestValue;
            }
        }
        return maxProfit;
    }
}
