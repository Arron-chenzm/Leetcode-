package Leetcode.longestPalindrome;

public class Solution {
    /**
     * 最长回文字符串
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        String res = new String();

        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0;
        int maxlen = 1;
        for (int j=0;j<s.length();j++){
            for (int i=0;i<=j;i++){
                if (i==j){
                    dp[i][j]=true;
                }else if (j-i==1){
                    dp[i][j]=(s.charAt(i)==s.charAt(j));
                }else{
                    dp[i][j]=(s.charAt(i)==s.charAt(j))&&dp[i+1][j-1];
                }
                if (dp[i][j]&&(j-i+1)>maxlen){
                    maxlen = j-i+1;
                    start=i;
                }
            }
        }
        res = s.substring(start,start+maxlen);
        return res;
    }

    public static void main(String[] args) {
        String a = "1";
        System.out.println(longestPalindrome(a));
    }
}
