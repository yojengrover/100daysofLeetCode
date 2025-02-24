/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            throw new IllegalArgumentException("The tree is empty.");
        }

        ArrayList<Integer> n = new ArrayList<>();
        arrS(root, n);

        if (k > 0 && k <= n.size()) {
            return n.get(k - 1);
        } else {
            throw new IllegalArgumentException("k is out of the valid range.");
        }
    }

    public void arrS(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        arrS(root.left, arr);
        arr.add(root.val);
        arrS(root.right, arr);
    }
}