package Leetcode.rotate;

public class Solution {
    /**
     * 旋转图像
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        rcore(matrix,0,length-1,length-1);

    }

    private void rcore(int[][] a, int start, int end, int num) {
        if (start>=end) return;
        for (int i=0;i<num;i++){
            int tem = a[start][start+i];
            a[start][start+i] = a[end-i][start];
            a[end-i][start] = a[end][end-i];
            a[end][end-i] = a[start+i][end];
            a[start+i][end]= tem;
        }
        rcore(a,start+1,end-1,num-2);
    }

}
