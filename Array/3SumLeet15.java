
import java.util.*;
class 3SumLeet15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>(); 
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                if((nums[i]+nums[l]+nums[r])==0){
                    List<Integer> LL=new ArrayList<>();
                    LL.add(nums[i]);
                    LL.add(nums[l]);
                    LL.add(nums[r]);
                    result.add(LL);
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
      return new ArrayList<>(result);
    }
}