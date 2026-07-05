class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String result="";
        String say=countAndSay(n-1);
        for(int i=0;i<say.length();i++){
            int count=1;
            char ch=say.charAt(i);
            while(i<say.length()-1 && say.charAt(i)==say.charAt(i+1)){
                count++;
                i++;
            }
            result+=count+String.valueOf(ch);
        }
        return result;
    }
}