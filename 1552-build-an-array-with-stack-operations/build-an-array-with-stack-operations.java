class Solution {
    public List<String> buildArray(int[] target, int n) {
        int n1 = target.length;
        List<String> ans = new ArrayList<>();
        int  p = 0;
        for(int i  = 0;i<n;i++){
        if(p==n1){
            break;
        }
        if(i+1==target[p]){
            ans.add("Push");
            p++;
        }
        
        else{
            ans.add("Push");
             ans.add("Pop");
        }

        }
        return ans;
    }
}