import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertIntervalLeet57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    int n=intervals.length;
    int[][] arr=new int[n+1][2];
    for(int i=0;i<n;i++){
        arr[i]=intervals[i];
    }
    arr[n]=newInterval;
    Arrays.sort(arr,(a,b)->a[0]-b[0]);
List<int[]> ans=new ArrayList<>();
    ans.add(arr[0]);
    for(int i=1;i<arr.length;i++){
        int[] prev=ans.get(ans.size()-1);
        int[] curr=arr[i];
        if(curr[0]<=prev[1]){
            prev[0]=Math.min(curr[0],prev[0]);
            prev[1]=Math.max(curr[1],prev[1]);
        }
        else{
            ans.add(arr[i]);
        }
    }
    int[][] res=new int[ans.size()][2];
    for(int i=0;i<res.length;i++){
        res[i]=ans.get(i);
    }
        return res;
    }
}
    

