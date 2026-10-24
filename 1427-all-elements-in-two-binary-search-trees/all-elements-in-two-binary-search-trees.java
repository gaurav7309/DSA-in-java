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
    public static void first(TreeNode root1,ArrayList<Integer> ans){
        if(root1==null){
            return ;
        }
        ans.add(root1.val);
      first(root1.left,ans);
      second(root1.right,ans);
     
      
    }
     public static void second(TreeNode root2,ArrayList<Integer> ans){
        if(root2==null){
            return ;
        }
      ans.add(root2.val);
      first(root2.left,ans);
      second(root2.right,ans);
     
      
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ans = new ArrayList<>();

        first(root1,ans);
        second(root2,ans);   
        Collections.sort(ans);
        return ans;
    }
}