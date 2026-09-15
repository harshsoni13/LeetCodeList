class Solution {
    public int maxProfit(int[] prices) {
   int buy=prices[0];
   int max=0;
   int curr=0;
   for(int i=1;i<prices.length;i++){
    if(prices[i]>buy){
        curr=prices[i]-buy;
        max=Math.max(curr,max);
    }
    else{
        buy=prices[i];
    }
   }
   return max;
    }}