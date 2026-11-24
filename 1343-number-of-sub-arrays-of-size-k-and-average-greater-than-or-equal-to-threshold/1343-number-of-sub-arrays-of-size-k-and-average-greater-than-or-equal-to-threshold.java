class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int i=0;
        int sum=0;
        int avg;
        int j;
        int count=0;
        for(j=0;j<k;j++){
            sum=sum+arr[j];
        }
         avg=sum/k;
         if(avg>=threshold){
            count++;
         }
        while(j<n){
            sum=sum-arr[i];
            sum=sum+arr[j];
            avg=sum/k;
             if(avg>=threshold){
                count++;
            }
            j++;
            i++;
        }
        return count;
    }
}