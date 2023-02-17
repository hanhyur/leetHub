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
    TreeNode prev = null;
    int min = Integer.MAX_VALUE;
    
    // 두 노드의 차 중 가장 작은 값을 구한다.
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        
        return min;
    }
    
    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        
        inOrder(node.left);
        
        if (prev != null) {
            min = Math.min(min, node.val - prev.val);
        }
        
        prev = node;
        
        inOrder(node.right);
    }
}