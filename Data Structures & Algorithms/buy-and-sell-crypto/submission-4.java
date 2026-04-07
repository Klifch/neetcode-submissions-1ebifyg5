class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        Integer maxSell = Integer.MIN_VALUE;
        Integer maxProfit = 0;

        for (int r = 0; r < prices.length; r++) {
            // System.out.println("Processing: " + prices[r] + " at index r = " + r + " current index l = " + l + " with value = " + prices[l]);
            // if (prices[r] < prices[l]) {
            //     System.out.println("Check tirggered " + prices[r] + " < " + prices[l]);
            //     l = r;
            //     System.out.print("Updating old maxSell from = " + maxSell);
            //     maxProfit = Math.max(maxProfit, )
            //     maxSell = prices[r];
            //     System.out.println("; New maxSell = " + maxSell);
            // } else {
            //     System.out.println("No check triggered, assigning maxSell to max of: " + maxSell + " <- and -> " + prices[r]);
            //     maxSell = Math.max(maxSell, prices[r]);
            // }

            maxProfit = Math.max(maxProfit, prices[r] - prices[l]);

            if (prices[l] > prices[r]) {
                l = r;
            }
        }

        return maxProfit;
    }
}
