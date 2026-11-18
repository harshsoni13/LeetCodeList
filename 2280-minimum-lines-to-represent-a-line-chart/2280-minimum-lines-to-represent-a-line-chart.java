class Solution {
    public int minimumLines(int[][] stockPrices) {
        int n=stockPrices.length;
        if(n<=1){
            return 0;
        }
        Arrays.sort(stockPrices,(a,b)->Integer.compare(a[0],b[0]));
        int lines=1;
        for(int i=2;i<n;i++){
            int a=(stockPrices[i-1][0]-stockPrices[i-2][0]);
            int b=(stockPrices[i][1]-stockPrices[i-1][1]);
            int c=(stockPrices[i][0]-stockPrices[i-1][0]);
            int d=(stockPrices[i-1][1]-stockPrices[i-2][1]);
            if((a*b)!=(c*d)){
                lines++;
            }
        }
        return lines;
    }
}