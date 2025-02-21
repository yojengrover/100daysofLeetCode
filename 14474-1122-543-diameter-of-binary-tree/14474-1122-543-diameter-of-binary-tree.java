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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null){
          return 0;  
        }
        
       int count = 0;
       int countl = 0;
        
        count = heigth(root.left); 
        countl = heigth(root.right);
        int currentH = count + countl;
        int maxH = 0;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

    return Math.max(currentH, Math.max(leftDiameter, rightDiameter));
        
    }

    public int heigth(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(heigth(node.left), heigth(node.right));
    }
}