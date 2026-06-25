class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ll=new ArrayList<>();
        List<Integer> L2=new ArrayList<>();
        for(int num:nums1){
            ll.add(num);
        }
        for(int num:nums2){
            if(ll.contains(num)){
                L2.add(num);
                ll.remove(Integer.valueOf(num));
            }
        }
        int i=0;
        int [] ans=new int[L2.size()];
        for(int num:L2){
            ans[i++]=num;
        }
        return ans;
    }
}