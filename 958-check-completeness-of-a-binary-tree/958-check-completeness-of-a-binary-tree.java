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
    public boolean isCompleteTree(TreeNode root) 
    {
        if( root == null)
            return false;
        boolean hasNull = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while( !queue.isEmpty()) {
            TreeNode temp = queue.remove();
            if( hasNull && temp != null )
                return false;
            if( temp == null)
                hasNull = true;
            if( temp != null) {
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return true;
    }
}