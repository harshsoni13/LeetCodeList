class Solution {
     List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubList(nums,0,new ArrayList<>());
        return res;
    }
    public void findSubList(int[] nums,int index,List<Integer> subList){
        if(index==nums.length){
            res.add(new ArrayList<>(subList));
            return ;
        }
        subList.add(nums[index]);
        findSubList(nums,index+1,subList);
        subList.remove(subList.size()-1);
        findSubList(nums,index+1,subList);
    }
}