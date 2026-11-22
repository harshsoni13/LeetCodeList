class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(!isVowel(arr[i])){
                i++;
            }
            else if(!isVowel(arr[j])){
                j--;
            }
            else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return new String(arr);
        }
        public boolean isVowel(char ch){
            if(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                return true;
            }
            else{
                return false;
            }
        }
        public void swap(char[] arr,int a,int b){
            char temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
}