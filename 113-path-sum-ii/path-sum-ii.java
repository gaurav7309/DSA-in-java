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
   List<List<Integer>> helper(TreeNode root,int target,List<List<Integer>> arr, ArrayList<Integer> brr,int sum) {
    if(root==null){
        return arr;
    }
    sum+=root.val;
    brr.add(root.val);
    if(sum==target && root.left==null && root.right==null){
        arr.add(new ArrayList(brr));
    }
    
    helper(root.left,target,arr,brr,sum);
    helper(root.right,target,arr,brr,sum);  
    brr.remove(brr.size()-1);
    return arr;

   }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<List<Integer>> arr = new ArrayList<>();
       ArrayList<Integer> brr = new ArrayList<>();
       
      return  helper(root,targetSum,arr,brr,0);

    }
}