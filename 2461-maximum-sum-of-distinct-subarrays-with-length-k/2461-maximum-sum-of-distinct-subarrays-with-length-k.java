class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        int left=0;
        int right=0;
        long max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            sum=sum+nums[right];
            int idx=map.getOrDefault(nums[right],-1);
            while(left<=idx || (right-left+1>k)){
                sum-=nums[left];
                left=left+1;
            }
            if((right-left+1)==k){
                max=Math.max(max,sum);
            }
            map.put(nums[right],right);
            right++;
        }
        return max;
    }
    
        
    }
