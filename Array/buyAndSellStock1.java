class buyAndSellStock1{
    public static int maxProfit(int[] prices){
        int min = prices[0];
        int profit = 0;
        int n = prices.length;
        for(int i=0;i<n;i++){
            int diff = prices[i] - min;
            if(diff > profit){
                profit = diff;           
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.print(maxProfit(prices));

    
    }
}