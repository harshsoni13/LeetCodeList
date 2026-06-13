import java.util.*;
class Armstrong1134{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int temp=n;
        int digit=0;
        while(temp>0){
            digit++;
            temp=temp/10;
        }
        temp=n;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            sum+=(int)Math.pow(r,digit);
            temp/=10;
        }
        if(sum==original){
            System.out.println("Yes it is armstrong number");
        }
        else{
            System.out.println("no");
        }
    }
}