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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>(); // result arr
        Stack<TreeNode> stack = new Stack<>(); // stack to immitate recursion
        TreeNode curr = root; // current node in iteration

        while (curr != null || !stack.isEmpty()) {

            // moving on the left branch while nodes exist
            while (curr != null) {
                stack.push(curr); // add each left node to the stack
                curr = curr.left; // after visiting node go to left leaf
            }

            // after inner while we exhausted all left nodes

            // pop last added node after inner while - inorder: !!(LEFT)!! -> ROOT -> RIGHT
            // in case if while didn't work and we are in the right null node we will pop the ROOT node;
            // IF we popped ROOT node we will try to go on the left branch of right node
            curr = stack.pop();
            res.add(curr.val);

            curr = curr.right;
        }

        return res;
    }
}