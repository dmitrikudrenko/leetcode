package task1379;

public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned == null || cloned.val == target.val) return cloned;

        TreeNode left = getTargetCopy(original, cloned.left, target);
        if (left != null) return left;

        TreeNode right = getTargetCopy(original, cloned.right, target);
        if (right != null) return right;

        return null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
