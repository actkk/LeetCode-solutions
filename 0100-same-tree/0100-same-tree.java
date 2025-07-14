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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String px = TreeToString(p);
        String qx = TreeToString(q);
        if(px.equals(qx))
        return true;
        return false;

    }
        public String TreeToString(TreeNode node) {
        if (node == null)
            return "";

        StringBuilder sb = new StringBuilder();
        sb.append(node.val);

        if (node.left != null || node.right != null) {
            sb.append("(").append(TreeToString(node.left)).append(")");
        }

        if (node.right != null) {
            sb.append("(").append(TreeToString(node.right)).append(")");
        }

        return sb.toString();
    }
}