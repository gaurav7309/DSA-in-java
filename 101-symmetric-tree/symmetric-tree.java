
class Solution {
    public boolean helper(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        else if(p==null || q==null){
            return false;
        }
        else if(p.val!=q.val){
           return false;
        }
        return helper(p.left,q.right) && helper(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
    if(root==null){
        return true;
    }    
    return  helper(root.left,root.right);
    }
}