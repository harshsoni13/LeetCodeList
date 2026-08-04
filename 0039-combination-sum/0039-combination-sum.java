class Solution {
    public static void solve(int[] candidates,int target,List<Integer>output,List<List<Integer>> ans,int index){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=candidates.length){
            return;
        }
        if(target < 0){
            return;
        }
        output.add(candidates[index]);
        solve(candidates,target-candidates[index],output,ans,index);
        output.remove(output.size()-1);
        solve(candidates,target,output,ans,index+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> output=new ArrayList<>();
       int index=0;
       solve(candidates,target,output,ans,index);
       return ans;  
    }
}