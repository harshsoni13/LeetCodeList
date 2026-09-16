class Solution {
    public int jump(int[] nums) {
        int fartest=0;
        int currVal=0;
        int jumps=0;
        for(int i=0;i<nums.length-1;i++){
            fartest=Math.max(fartest,nums[i]+i);
            if(i==currVal){
                jumps++;
                currVal=fartest;
            }
        }
        return jumps;
    }
}