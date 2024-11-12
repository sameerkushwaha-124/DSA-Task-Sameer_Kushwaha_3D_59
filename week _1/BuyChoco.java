class Solution {
    public int buyChoco(int[] prices, int money) {
        int initial = money;
        int count = 0;
        Arrays.sort(prices);
        for(int i = 0; i < prices.length; i++){
            money -= prices[i];
            if(money >= 0){
                count++;
                if(count >= 2){
                    return money;
                }
            }
        }
        return initial;
    }
}
