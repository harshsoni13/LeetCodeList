class Solution {
    public int trailingZeroes(int n) {
        int trailingZero=0;
        while(n>0){
            n=n/5;
            trailingZero+=n;
        }
        return trailingZero;
    }
}