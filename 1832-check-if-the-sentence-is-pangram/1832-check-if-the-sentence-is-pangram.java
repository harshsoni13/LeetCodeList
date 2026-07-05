class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        int arr[]=new int[26];
        for(char ch : sentence.toCharArray()){
            int idx= ch -'a';
            arr[idx]++;
        }
        for(int a:arr){
            if(a==0){
                return false;
            }
        }
return true;

    }
}