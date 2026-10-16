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
   static List<String> helper(TreeNode root, List<String> arr , String ans ){
    if(root == null){
    return arr;
    }
    ans+=Integer.toString(root.val);
    if(root.left==null && root.right==null){
    arr.add(ans);
    }
    ans+='-';
    ans+='>';
    
    helper(root.left,arr,ans);
    helper(root.right,arr,ans);
    return arr;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        String temp = "";
        return helper(root,arr,temp);
    }
}