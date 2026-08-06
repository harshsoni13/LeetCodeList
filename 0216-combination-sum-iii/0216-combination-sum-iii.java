class Solution {
    public static void solve(List<List<Integer>> ans,List<Integer> output,int[] arr,int index,int k,int n){
        if(n==0 && output.size() == k){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>= arr.length || output.size()>k){
            return;
        }
        if(n<0){
            return ;
        }
        int curr=arr[index];
        output.add(curr);
        solve(ans,output,arr,index+1,k,n-arr[index]);
        output.remove(output.size()-1);
        while(index+1<arr.length && arr[index]==arr[index+1]){
            index++;
        }
        solve(ans,output,arr,index+1,k,n);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr);
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> output=new ArrayList<>();
         int index=0;
         solve(ans,output,arr,index,k,n);
         return ans;
    }
}