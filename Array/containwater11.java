public class containwater11 {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxwater=0;
        while(l<r){
            int contain=Math.min(height[l],height[r])*(r-l);
            maxwater=Math.max(maxwater,contain);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
    return maxwater;
    }
}
    

