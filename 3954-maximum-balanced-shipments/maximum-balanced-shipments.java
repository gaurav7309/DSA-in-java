class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i = 0;i<n;i++){
            boolean  flag = false;
            while(!st.isEmpty() && st.peek()>weight[i]){
                while(!st.isEmpty()){
                 st.pop();
                }
              
                flag = true;
            }
          
            if(flag){
                ans++;
            }
            else{
                  st.push(weight[i]);
            }
        }
    
        return ans;
    }
}