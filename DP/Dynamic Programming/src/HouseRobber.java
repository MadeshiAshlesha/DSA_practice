import java.util.*;
public class HouseRobber{
    public static int f(int ind, int[] arr,int[] dp ){
        // if(ind==0){
        //     return arr[ind];
        // }
       
        // dp[0]=arr[0];
        int prev=arr[0];
        int prev2=0;
        
        // if(ind<1){
        //     return 0;
        // }
        // if(dp[ind]!=-1){
        //     return dp[ind];
        // }
       for(int i=1;i<ind ;i++)
    //    { int pick=arr[i];
        { int pick=arr[i];
        if(i>1){
            // pick+=dp[i-2];
            pick+=prev2;
        }
        // int notpick=0+dp[i -1];
        int notpick=0+prev;
        // dp[i]=Math.max(pick,notpick);
        int curi=Math.max(pick,notpick);
        // System.out.println(i+" :"+dp[i]);
        prev2=prev;
        prev=curi;

    }
        //  return dp[ind-1];
        // return Math.max(pick, notpick);
        return prev;
    }
    public static int max(int n,int[] a){
        
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return f(n,a, dp);
    }
    public static void main(String[] args){
        int arr[]={2, 1, 4, 9};
        int n=arr.length;
        int result=max(n,arr);
        System.out.println(result);
    }
}