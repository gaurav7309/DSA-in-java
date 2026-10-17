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
   static int helper(TreeNode root,ArrayList<Integer> arr ,int target,long sum,int c){
    if(root==null){
        return c;
    }    
    sum+=root.val;
    arr.add(root.val);
    if(sum==target){
    c++;
    }
    c = helper(root.left,arr,target,sum,c);
    c = helper(root.right,arr,target,sum,c);
    sum-=arr.get(arr.size()-1);
    arr.remove(arr.size()-1);

    return c;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
    ArrayList<Integer>  arr = new ArrayList<>();
    int c =   helper(root,arr,targetSum,0,0);   
    c+=pathSum(root.left,targetSum);
    c+=pathSum(root.right,targetSum);
    return c;
    }
}