class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        findsubList(nums,0,new ArrayList<>());
        return res;
    }
    public void findsubList(int[] nums,int index,List<Integer> subList){
        if(index==nums.length){
            res.add(new ArrayList<>(subList));
            return;
        }
        subList.add(nums[index]);
        findsubList(nums,index+1,subList);
        subList.remove(subList.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        findsubList(nums,index+1,subList);
    }
}