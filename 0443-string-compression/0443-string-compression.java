class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int index=0;
        while(i<n){
            int count=0;
           char curr_char=chars[i];
            while(i<n && chars[i]==curr_char){
                count++;
                i++;}
                chars[index]=curr_char;
                index++;
                if(count>1){
                    String str=String.valueOf(count);
                    for(char ch :str.toCharArray()){
                        chars[index]=ch;
                        index++;
                    }
                }
            }
        return index;
        
    }
}