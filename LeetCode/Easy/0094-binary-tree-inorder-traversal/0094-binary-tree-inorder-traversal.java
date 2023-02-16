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
    static List<Integer> list;
    
    // 중위 순회 : left -> root -> right 순으로 탐색
    public void inOrder(TreeNode node) {
        // node 값이 존재할 때
        if (node != null) {
            
            // left 탐색
            if (node.left != null) {
                inOrder(node.left);
            }
            
            // root 값 저장
            list.add(node.val);
            
            // right 탐색
            if (node.right != null) {
                inOrder(node.right);
            }
        }
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();
        
        inOrder(root);
        
        return list;
    }
}