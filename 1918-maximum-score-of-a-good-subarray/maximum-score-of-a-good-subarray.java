class Solution {
    public int maximumScore(int[] nums, int k) {
       int n = nums.length;
       Stack<Integer> st1 = new Stack<>();
       Stack<Integer> st2 = new Stack<>();
        int [] nse = new int [n];
        int [] pse = new int [n];
        java.util.Arrays.fill(nse,n);
        java.util.Arrays.fill(pse,-1);
        // for the calculating of the nse
        for(int i = 0;i<n;i++){
            while(!st2.isEmpty() && nums[i]<nums[st2.peek()]){
                nse[st2.pop()] = i;
                
            }
            st2.push(i);
        }
        // for the calculating of the smallest pse

        for(int i = n-1;i>=0;i--){
            while(!st1.isEmpty() && nums[i]<=nums[st1.peek()]){
                pse[st1.pop()] = i;
                
            }
            st1.push(i);
        }
        int max  = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int u = -1;
            if(k>pse[i] && k<nse[i]){
            u = nums[i]*(nse[i]-pse[i]-1);
            }
            max = Math.max(max,u);

        }
        return max;
    }
}