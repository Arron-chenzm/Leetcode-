package Leetcode.merge;

import java.util.ArrayList;

public class Solution {
    /**
     * 合并两个有序数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<m&&j<n){
            if (nums1[i]<=nums2[j]){
                res[count++] = nums1[i];
                i++;
            }else{
                res[count++] = nums2[j];
                j++;
            }
        }
        for (;i<m;i++){
            res[count++] = nums1[i];
        }
        for (;j<n;j++){
            res[count++]= nums2[j];
        }
        for (int k=0;k<m+n;k++){
            nums1[k] = res[k];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,3,5};
        ArrayList<Integer> list = new ArrayList();
        merge(a,3,b,3);
        for (int c:a)
            System.out.println(c);
    }
}
