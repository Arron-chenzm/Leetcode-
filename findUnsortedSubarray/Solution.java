package Leetcode.findUnsortedSubarray;
class Solution {
    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int max = nums[0];
        int min = nums[len-1];
        int index1 =0;
        int index2 =0;
        for (int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            if(max>nums[i]){
                index1 = i;
            }
        }
        for (int j=nums.length-1;j>=0;j--){
            min = Math.min(min,nums[j]);
            if (min<nums[j]){
                index2=j;

            }
        }
        return index2-index1!=0?Math.abs(index2-index1)+1:0;
    }
}