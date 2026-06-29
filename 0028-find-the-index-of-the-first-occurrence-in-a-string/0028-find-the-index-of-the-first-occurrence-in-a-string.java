class Solution {
    public boolean compare(String s,String b,int i){
        int n=s.length();
        int m=b.length();
       for(int j=0;j<m;j++){
        if(i>=n) return false;
        if(s.charAt(i++)!=b.charAt(j)){
            return false;
        }
       }
       return true;}
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<n;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(compare(haystack,needle,i)==true){
                    return i;
                }
            }
        }
     
     return -1;   
    }
}