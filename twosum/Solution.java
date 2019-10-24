package Leetcode.twosum;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1;
        int index2;
        int[] res = new int[2];
        for(index1 = 0;index1<numbers.length;index1++){
            for(index2 = index1+1;index2<numbers.length;index2++){
                if(numbers[index1]+numbers[index2]==target){
                    res[0] = index1+1;
                    res[1] = index2+1;
                    return res;
                }
            }
        }
        return res;
    }
    public int[] twoSum2(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length-1;
        int[] res = new int[2];
        while(index1<index2){
            if(numbers[index1]+numbers[index2]==target){
                res[0] =index1+1;
                res[1] = index2+1;
                return res;
            }else if(numbers[index1]+numbers[index2]<target){
                index1++;
            }else if(numbers[index1]+numbers[index2]>target){
                index2--;
            }
        }
        return res;
    }
}
