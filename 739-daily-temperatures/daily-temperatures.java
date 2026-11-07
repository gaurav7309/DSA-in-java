class Solution {
    public static class pair{
        int val;
        int idx;
        pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<pair> st = new Stack<>();
        
        int n = temperatures.length;
        int [] ans   =  new int [n];

        for(int i = 0;i<n;i++){
        while(!st.isEmpty() && st.peek().val<temperatures[i]){
            pair use = st.pop();
            int in = Math.min(i,use.idx);
            ans[in] = i-use.idx;
            
        }
        st.push(new pair(temperatures[i],i));
        }
        return ans;
    }
}