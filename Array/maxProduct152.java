public class maxProduct152 {
    public int maxProduct(int[] nums) {
    int n=nums.length;
    int mini=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        int product=1;
        for(int j=i;j<n;j++){
         product*=nums[j];
         mini=Math.max(product,mini);
        }
    }
    return mini;

}}
    
