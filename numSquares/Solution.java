package Leetcode.numSquares;

public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1] = 1;
        for (int i=1;i<n+1;i++){
            int num = Integer.MAX_VALUE;
            for (int j=1;j*j<i;j++){
                num = Math.min(num,dp[i-j*2]);
                dp[i] = num+1;
            }
        }
        return dp[n];

    }
}
