class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        helper(n,0,0,"",list);   
        return list;
    }
    private static void helper(int n, int l,int r,String s,List<String> list ){
        if(l==n && r==n){
            list.add(s);
            return;
        }
      if(l<n){
         helper(n,l+1,r,s+"(",list);
      } 
      if(r<l){
        helper(n,l,r+1,s+")",list);
      } 
    }
}