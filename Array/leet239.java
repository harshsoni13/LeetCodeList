public class leet239 {
    public static void main(String[] args)
{
    int nums[]={1,3,4,5,3,5,254,-2,-4,-5,-6,9};
    int n=nums.length;
    int k=3;
    int i=0;
    int arr[]= new int[n-k+1];
    for(int left=0;left<=n-k;left++){
        int max=nums[left];
    for(int right=left;right<left+k;right++){
        max=Math.max(max,nums[right]);
    }
arr[i++]=max;
    }
    for(int j=0;j<arr.length;j++){
System.out.println(arr[j]);
    }
}    
}
