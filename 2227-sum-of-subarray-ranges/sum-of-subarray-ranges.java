class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        // take the one stack tahat do teh  nse and rhe nse  
        Stack<Integer> st = new Stack<>();
        int [] pse  = new int[n];
        int [] nse = new int[n];
        int [] pge = new int[n];
        int [] nge = new int[n];
        // fill teh pse_index and the nse_indez fill eith teh -1 and the nse with the n
        java.util.Arrays.fill(pse,-1);
        java.util.Arrays.fill(nse,n);
         // same for the fill teh pse and the nse fill eith teh -1 and the nse with the n
        java.util.Arrays.fill(pge,-1);
        java.util.Arrays.fill(nge,n);
        // find the min nse a;; the  smallest ele of all the ele
        for(int i = 0;i<n;i++){
        while(!st.isEmpty() && nums[i]<nums[st.peek()]){
            nse[st.peek()] = i;
            
            st.pop();
        }
        st.push(i);
        }
        // cleat the stack
        st.clear();
        // then find out the pre smallest ele
       for(int i = n-1;i>=0;i--){
        while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
            pse[st.peek()] = i;
            
            st.pop();
         }
        st.push(i);
        }
         st.clear(); // again cleat the stack
         // then find out the pge forall teh ele

         for(int i = n-1;i>=0;i--){
        while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
            pge[st.peek()] = i;
            
            st.pop();
         }
        st.push(i);
        }
         st.clear(); // again cleat the stack

         // then find out the nge
          for(int i = 0;i<n;i++){
         while(!st.isEmpty() && nums[i]>nums[st.peek()]){
            nge[st.peek()] = i;
            
            st.pop();
        }
        st.push(i);
        }
        st.clear();
        // then calculate also check whether in the pse and teh nse array which one is the smallest  = Math.min(pse[i],nse[i]);
        long ans = 0;
        long max = 0; 
        long min = 0;
        for(int i = 0;i<n;i++){
        min = (long)nums[i]*(nse[i]-i)*(i-pse[i]);
        max = (long)nums[i]*(nge[i]-i)*(i-pge[i]);
        ans+=max-min;
        }

        return ans;

    }
}