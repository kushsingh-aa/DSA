class Solution {
    public int maxProfit(int[] prices) {
        int hold1=Integer.MIN_VALUE;
        int profit1=0;
        int hold2=Integer.MIN_VALUE;
        int profit2=0;
        for(int price:prices){
            hold1=Math.max(hold1,-price);
            profit1=Math.max(profit1,hold1+price);
            hold2=Math.max(hold2,profit1-price);
            profit2=Math.max(profit2,hold2+price);
        }
        return profit2;
    }
}