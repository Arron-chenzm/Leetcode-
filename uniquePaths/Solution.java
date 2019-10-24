package Leetcode.uniquePaths;

public class Solution {
    public static int uniquePaths(int m, int n){
        int[][] dp = new int[m][n];
        for(int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==0){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static int uniquePaths1(int m, int n) {
        int a = m+n-2;
        int b =m>n?n-1: m-1;
        return sumcore(a)/(sumcore(a-b)*sumcore(b));

    }
    public  static int sumcore(int m){
        if (m==0) return 1;
        return m*sumcore(m-1);
    }

    public static void main(String[] args) {

        System.out.println(uniquePaths(99,3));
    }
}

