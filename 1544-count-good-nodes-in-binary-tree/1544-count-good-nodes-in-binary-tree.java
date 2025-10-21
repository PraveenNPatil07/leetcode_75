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
    public int goodNodes(TreeNode root) {
        yo(root, root.val);
        return res;
    }
    private void yo(TreeNode root, int max){
        if(root == null) return;
        if(max <= root.val) res++;
        yo(root.left, Math.max(max, root.val));
        yo(root.right, Math.max(max, root.val));
    }
}