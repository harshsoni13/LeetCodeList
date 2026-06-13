import java.util.*;
class Twosum1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for (int idx = 0; idx < n; idx++) {
            nums[idx]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    
    public  static int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
           if(map.containsKey(need)){
            return new int[]{map.get(need),i};
           }
           map.put(nums[i],i);
        }
        return new int[]{-1,-1};
 }
}
