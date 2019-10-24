package Leetcode.maxSubArray;

public class Solution {
    public static int maxSubArray(int[] nums){
        int fn = 0;
        int res = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            fn = Math.max(nums[i],fn+nums[i]);
            res = Math.max(res,fn);
        }
        return res;
    }
    public static int maxSubArray1(int[] nums) {
        int max = nums[0];
        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                int sum = sumcore(nums,i,j);
                max=Math.max(max,sum);
            }
        }
        return max;

    }

    private static int sumcore(int[] nums, int i, int j) {
        int res=0;
        for(int k=i;k<=j;k++){
            res +=nums[k];
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ba[] = {1};
        System.out.println(maxSubArray1(a));
        System.out.println(maxSubArray(ba));

    }
}
