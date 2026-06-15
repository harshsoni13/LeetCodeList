public class minimumRotate153{
    public int findMin(int[] nums) {
      int n=nums.length;
      int left=0;
      int right=n-1;
      int ans=Integer.MAX_VALUE;
      while(left<=right){
        int mid=(left+right)/2;
        if(nums[left]<=nums[mid]){
            ans=Math.min(ans,nums[left]);
            left=mid+1;
        }
        else{
            ans=Math.min(ans,nums[mid]);
            right=mid-1;
        }
      }
      return ans;
    }
}
    
