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
    public static ArrayList<Integer> PreOrder(TreeNode root, ArrayList<Integer> arr){
    if(root==null){
       
        return arr;
    }
    arr.add(root.val);
    PreOrder(root.left,arr);
    PreOrder(root.right,arr);
    return arr;
    }
    public void flatten(TreeNode root) {
        if(root==null){
            return ;
        }
        ArrayList<Integer> arr  = new ArrayList<>();
        PreOrder(root,arr);
        
        // create a new tree for the restoring the ans

        TreeNode  ans   = root;
        
        for(int i  = 1;i<arr.size();i++){
      
        ans.left = null;
        ans.right = new TreeNode(arr.get(i));
        ans = ans.right;
        }
        ans.right = null;
        ans.left = null;
        
    }
}