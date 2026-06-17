class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        int low=0;
        int sum=0;
        for( int high=0;high<n;high++){
            sum+=nums[high];
            while(sum>=target){
                int currlen=high-low+1;
                mini=Math.min(mini,currlen);
                sum-=nums[low];
                low++;
            }
    }
     return mini==Integer.MAX_VALUE?0:mini;     
}
}