package Leetcode.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * 判断是否有重复元素
     * @param nums 数组
     * @return 布尔
     */
    public static boolean containsDuplicate1(int[] nums) {
        if (nums.length<=1) return true;
        Set<Integer> list = new HashSet<>();
        for (int i:nums){
            if (!list.add(i)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate(int[] nums) {
        fastsort(nums,0,nums.length-1);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void fastsort(int[] nums,int low,int high){
        if(low>=high) return;
        int tem = nums[low];
        int a = low;
        int b = high;
        while(high>low){
            while(high>low&&nums[high]>tem){
                high--;
            }
            nums[low] = nums[high];
            while(high>low&&nums[low]<=tem){
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = tem;
        fastsort(nums,a,low-1);
        fastsort(nums,low+1,b);

    }
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,1};
        System.out.println(containsDuplicate(num));
    }
}
