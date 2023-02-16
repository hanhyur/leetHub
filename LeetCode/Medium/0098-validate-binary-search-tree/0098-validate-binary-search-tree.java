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
    // BST가 성립하기 위해서는 root의 left(하위 node 포함)는 root보다 작아야하고
    // root의 right(하위 node 포함)는 root보다 커야한다.
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        
        // root의 값이 범위를 벗어났다면
        if (root.val <= min || root.val >= max) {
            return false;
        }
        
        // left와 right 모두 만족하는가?
        return isValid(root.left, min, root.val)
            && isValid(root.right, root.val, max);
    }
}