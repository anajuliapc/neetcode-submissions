class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                val currProfit = price - minPrice
                if (currProfit > maxProfit) {
                    maxProfit = currProfit
                }
            }
        }
        return maxProfit
    }
}
