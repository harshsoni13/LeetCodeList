class Solution {
    public int lengthOfLongestSubstring(String s) {
    int start=0;
    int end=0;
    int maxValue=0;
    List<Character> li=new ArrayList<>();
    while(end<s.length()){
        if(!li.contains(s.charAt(end))){
            li.add(s.charAt(end));
            end++;
            maxValue=Math.max(maxValue,li.size());
        }
        else{
            li.remove(Character.valueOf(s.charAt(start)));
            start++;
        }
    }
    return maxValue;
    }}