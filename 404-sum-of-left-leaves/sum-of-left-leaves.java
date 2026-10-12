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
    public static int sumleave(TreeNode root,int sum){
        if(root==null){
            return sum;
        }
        else if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;

        }
        sum =  sumleave(root.left,sum);
        sum =  sumleave(root.right,sum);
         return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
     if(root==null){
        return 0;
     }  
    return sumleave(root,0);
  
    }
}