class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1){
            return word;
        }
        int n=word.length();
        String result="";
        int longest=n-(numFriends-1);
        for(int i=0;i<n;i++){
            int take=Math.min(longest,n-i);
            String curr=word.substring(i,i+take);
            if(curr.compareTo(result)>0){
                result=curr;
            }
        }
        return result;
    }
}