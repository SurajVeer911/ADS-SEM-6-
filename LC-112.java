class Solution {
    public boolean hasPathSum(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        
        if (root.left == null && root.right == null && root.val == target) {
            return true;
        }
        
        int remainingSum = target - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}
