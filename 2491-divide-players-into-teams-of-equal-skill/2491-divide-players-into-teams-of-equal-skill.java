class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        Arrays.sort(skill);
        int left=0;
        int right=n-1;
        long sum=0;
        int tar=skill[left]+skill[right];
        while(left<right){
            if(tar!=skill[left]+skill[right]){
                return -1;
            }
            int chem=skill[left]*skill[right];
            sum+=chem;
           left++;
           right--;
        }
         return sum;
}}
       