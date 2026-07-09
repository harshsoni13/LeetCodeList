class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length<=2){
            return nums;
        }
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int marks=xor & (-xor);
        int a=0;
        int b=0;
        for(int num: nums){
            if((num & marks)==0){
                a^=num;
            }
            else{
                b^=num;
            }
        }
return new int[]{a,b};
    }
}