class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left=0;
       int right=0;
       int arr[]=new int[256];
       int maxLength=0;
       while(right<s.length()){
        char current=s.charAt(right);
        int asci=(int)current;
        arr[asci]=arr[asci]+1;
        while(arr[asci]>1){
            char currentleft=s.charAt(left);
            int ascil=(int)currentleft;
            arr[ascil]=arr[ascil]-1;
            left++;
        }
        int currentlen=right-left+1;
        if(currentlen>maxLength){
            maxLength=currentlen;
        }
        right++;
       }return maxLength;}}