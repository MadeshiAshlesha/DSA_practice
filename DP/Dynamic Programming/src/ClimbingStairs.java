import java.util.Arrays;
import java.util.Scanner;
public class ClimbingStairs {
 public static int climb(int n, int[] dp){
    if(n<=1){
        return n;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    return climb(n-1,dp)+climb(n-2,dp);
 } // memoization    
 public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    
       int[] dp=new int[n+1];
        Arrays.fill(dp, -1); // for(int i=0; i<dp.length;i++){
    //     dp[i]=-1;
    // }

    // dp[0]=0;
    // dp[1]=1;
//     int prev2=0;
//     int prev=1;

// for(int i=2; i<=n;i++){
//     // dp[i]=dp[i-1]+dp[i-2];
//     int cur_i=prev+prev2;
//     prev2=prev;
//     prev=cur_i;
// }
// // System.out.println(dp[n]);
// System.out.println(prev);
     System.out.println(climb(n, dp));   //memoization
 }  
}
