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
     int res = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        yo(root, 0, 0);
        yo(root, 1, 0);
        return res;
    }
    private void yo(TreeNode node, int direction, int length) {
        if (node == null) return;
        res = Math.max(res, length);
        if (direction == 0) {
            yo(node.left, 0, 1); 
            yo(node.right, 1, length + 1); 
        } else {
            yo(node.right, 1, 1); 
            yo(node.left, 0, length + 1); 
        }
    }
}