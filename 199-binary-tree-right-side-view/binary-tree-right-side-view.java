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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null){
            return arr;
        }
     
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        arr.add(q.peek().val);
       int level = q.size();

       
        while(level!=0){
        TreeNode check  = q.remove();
        if(check.right!=null) q.add(check.right);
        if(check.left!=null) q.add(check.left);
        level--;
        }
       } 
       return arr;
    }
}