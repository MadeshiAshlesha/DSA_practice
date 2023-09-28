import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class FrogJump {
    // public static int f(int ind, int [] heights, int[] dp ){
    //     if(ind==0){
    //         return 0;
    //     }
    //     if(dp[ind]!=-1){
    //         return dp[ind];
    //     }
    //     int left=f(ind -1, heights,dp)+Math.abs(f(ind, heights,dp)- f(ind -1, heights,dp));
    //     int right= Integer.MAX_VALUE;
    //     if(ind>1){
    //         right=f(ind -2, heights,dp)+Math.abs(f(ind, heights,dp)- f(ind -2, heights,dp));
    //     }
    //     return dp[ind]= Math.min(left, right);
    // }
    public static int jump (int n, int heights[] ){
        // int[] dp=new int[n+1];
        // Arrays.fill(dp, -1);
        // // return f(n-1, heights, dp);

        // dp[0]=0;
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){
            //int ls=dp[i-1] + Math.abs(heights[i] -heights[i-1]);
            int ls=prev+ Math.abs(heights[i] -heights[i-1]);
            int rs= Integer.MAX_VALUE;
        if(i>1){
            // rs=dp[i-2]+Math.abs(heights[i]- heights[i-2]);
            rs=prev2+Math.abs(heights[i]- heights[i-2]);
        }
        // dp[i]=Math.min(ls,rs);

        int curi=Math.min(ls, rs);
        prev2=prev;
        curi=prev;

        }
        // return dp[n-1];
        return prev;
    }

    
        public static void main(String[] args){

        }
}
