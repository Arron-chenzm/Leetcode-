package Leetcode.isValidBST;

import java.util.ArrayList;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = iscore(root);
        if (root==null) return false;
        for (int i=0;i<list.size()-1;i++){
            if (list.get(i+1)<=list.get(i)){
                return false;
            }
        }
        return true;

    }
    public ArrayList<Integer> iscore(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.addAll(iscore(root.left));
        list.add(root.val);
        list.addAll(iscore(root.right));
        return list;
    }
}
