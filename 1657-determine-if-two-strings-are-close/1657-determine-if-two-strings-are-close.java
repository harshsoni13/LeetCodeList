class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(n!=m){
            return false;
        }
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<n;i++){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);
            int idx1=ch1-'a';
            int idx2=ch2-'a';
            arr1[idx1]++;
            arr2[idx2]++;
        }
        for(int i=0;i<26;i++){
        if((arr1[i]!=0 && arr2[i]==0) ||
        (arr1[i]==0 && arr2[i]!=0)){
        return false;
    }}
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
}}
