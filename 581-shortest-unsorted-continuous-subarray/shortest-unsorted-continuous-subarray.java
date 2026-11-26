class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int start = Integer.MAX_VALUE;
        int end  = 0;
        Stack<Integer> st  = new Stack<>();
        // for the finding the start position
        int i;
        for(i = 0;i<n;i++){
             boolean flag = false;
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
            start = Math.min(start,st.peek());
            st.pop();
             
           
            }

             
            st.push(i);
        }
        // for the fondign the lsast symbol that ate the use full vety much
        st.clear();
        // int max = Integer.MIN_VALUE;
         for( int j = n-1;j>=0;j--){
             boolean flag = false;
            while(!st.isEmpty() && nums[st.peek()]<nums[j]){
            int max = st.pop();
            end = Math.max(end,max);
            //  flag = true;
            //  break;
            }
            //  if(flag){
            //     break;
            //  }
            st.push(j);
        }  
        int ans = (end-start+1);
        return end > start ? end - start + 1 : 0;
    }
}