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
    static PriorityQueue<Integer> store(TreeNode root,PriorityQueue<Integer>pq){
        if(root==null){
            return null;
        }
        pq.add(root.val);
        store(root.left,pq);
        store(root.right,pq);
        return pq;
    }
    public int kthSmallest(TreeNode root, int k) {
      var pq = new PriorityQueue<Integer>();
        store(root,pq);
        while(k-1!=0){
            pq.remove();
            k--;
            
        }
        return pq.remove();
    }
}