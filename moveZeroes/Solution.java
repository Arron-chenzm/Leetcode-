package Leetcode.moveZeroes;

public class Solution {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for (int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[]  arr= {};
        moveZeroes(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }
}
