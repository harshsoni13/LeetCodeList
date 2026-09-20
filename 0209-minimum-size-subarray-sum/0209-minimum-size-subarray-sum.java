class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int n=nums.length;
      int low=0;
      int curr=0;
      int sum=0;
      int mini=Integer.MAX_VALUE;
      for(int high=0;high<n;high++){
        sum+=nums[high];
        while(sum>=target){
            curr=high-low+1;
            mini=Math.min(curr,mini);
            sum-=nums[low];
            low++;
        }
      }
      return mini==Integer.MAX_VALUE?0:mini;}}
      