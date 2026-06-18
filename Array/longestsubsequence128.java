import java.util.HashSet;

public class longestsubsequence128 {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer> set=new HashSet<>();
    for(int num:nums){
        set.add(num);
    }int longest=0;
    for(int ele:set){
        if(!set.contains(ele-1)){
            int curr=ele;
            int count=1;
            while(set.contains(curr+1)){
                curr++;
                count++;
            }
longest=Math.max(longest,count);
        }
    }
        return longest;
    }
}
    

