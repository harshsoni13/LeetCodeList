class Solution {
    public int singleNumber(int[] nums){
        int result=0;
    for(int i=0;i<=31;i++){
        int temp=(1<<i);
        int countOnes=0;
        int countZero=0;
        for(int num: nums){
            if((num & temp)==0){
                countZero++;
            }
            else{
                countOnes++;
            }
        }
        if((countOnes%3)==1){
            result=(result | temp);
        }
       
    }
     return result;
}}