package Leetcode.isValid;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length()==0) return true;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch:chars){
            if (stack.empty()){
                stack.push(ch);
            }else if (match(stack.peek(),ch)){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.empty()?true:false;

    }

    private boolean match(Character peek, char ch) {
        return (peek=='('&&ch==')')||(peek=='['&&ch==']')||(peek=='{'&&ch=='}');
    }
}
