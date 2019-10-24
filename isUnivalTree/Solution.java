package Leetcode.isUnivalTree;

public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        int tem = root.val;
        return iscore(root,tem);
    }
    public boolean iscore(TreeNode root,int tem){
        if (root == null){
            return true;
        }
        if (root.val!=tem) return false;
        return iscore(root.left,tem)&iscore(root.right,tem);
    }
}
