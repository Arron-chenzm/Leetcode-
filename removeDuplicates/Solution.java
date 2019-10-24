package Leetcode.removeDuplicates;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int len = nums.length;
        if (len<=1){
            return len;
        }
        while (j<len){
            if (nums[i] != nums[j]){
                i++;
                j++;
            }else {
                while (nums[i] != nums[j])j++;
                for (int k = j;k<len;k++){
                    nums[i+1+k-j] = nums[k];
                }
            }
        }
        return j;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6,7};
        System.out.println(removeDuplicates(nums));
    }
}