package Leetcode.reverseString;

public class Solution {
    public static void reverseString(char[] s) {
        if (s.length<=1) return;
        for (int i=0;i<s.length/2;i++){
            char tem = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tem;
        }
    }

    public static void main(String[] args) {
        char[] s = {'a','b','c','d'};
        reverseString(s);
        for (char i :s){
            System.out.print(i+" ");
        }

    }
}
