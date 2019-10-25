package Leetcode.diameterOfBinaryTree;

public class Solution {
    /**
     * 给定一棵二叉树，你需要计算它的直径长度。
     * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
     */
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int a = diacore(root);
        return max;
    }

    public int diacore(TreeNode root) {
        if (root == null) return 0;
        int left = diacore(root.left);
        int right = diacore(root.right);
        max = Math.max(max, right + left);
        return right > left ? right + 1 : left + 1;
    }
}
