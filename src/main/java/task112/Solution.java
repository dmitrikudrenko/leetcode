package task112;

public class Solution {
    private static class TreeNode {
        TreeNode right;
        TreeNode left;
        int val;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null && targetSum == root.val) return true;
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}
