class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int sum=0;
        double avg;
        int j;
        for( j=0;j<k;j++){
            sum=sum+nums[j];
        }
          double max=(double)sum/k;
        while(j<n){
            sum=sum-nums[i];
            sum=sum+nums[j];
            avg=(double)sum/k;
            max=Math.max(max,avg);
            i++;
            j++;
        }
        return max;
    }
}