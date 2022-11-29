package NewtonMock;
import java.util.*;
public class Mock11 {
    public static int nthStair(int n,int[] dp){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        int ans = nthStair(n-1,dp) + nthStair(n-2,dp);
        System.out.println("n -- " +n +" ans --- "+ans);
        dp[n] = ans;
        return ans;
        
    }
    public static void main(String[] args) {
        long nStairs = 51;
        int size = (int)nStairs;
        int dp[] = new int[size+1];
        // int num = 951279875;
        Arrays.fill(dp,-1);
//         Collections.fill(dp,-1);
        System.out.println(nthStair(size,dp));        

    }
}
