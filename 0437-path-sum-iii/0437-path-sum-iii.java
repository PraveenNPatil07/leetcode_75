/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int res = countPathsFromNode(root, targetSum);

        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);

        return res;
    }

    private int countPathsFromNode(TreeNode node, long targetSum) {
        if (node == null) return 0;

        int count = 0;
        if (node.val == targetSum) count++;

        count += countPathsFromNode(node.left, targetSum - node.val);
        count += countPathsFromNode(node.right, targetSum - node.val);

        return count;
    }
}