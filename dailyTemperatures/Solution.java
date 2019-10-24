package Leetcode.dailyTemperatures;

import java.util.Stack;

public class Solution {
    public static int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<T.length;i++){

            while(!stack.empty()&&T[stack.peek()]<T[i]){
                res[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a ={1};
        for (int i:dailyTemperatures(a))    System.out.println(i);
    }
}
