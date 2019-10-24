package Leetcode.maxProfit;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int maxProfit(int[] prices) {
        if (prices.length<=1) return 0;
        int max = 0;
        for (int i = 0;i<prices.length;i++){
            for (int j=i;j<prices.length;j++){
                max = Math.max(max,prices[j]-prices[i]);
            }
        }
        return max;
    }
    public static int maxProfit2(int[] prices){
        if (prices.length<=1) return 0;
        int max = 0;
        int min = prices[0];
        for (int i=1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
        System.out.println(maxProfit2(a));
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        System.out.println(list);
    }
}
