class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        // for the increasing order 
        Stack<Integer> st1 = new Stack<>();

        int In_len = Integer.MIN_VALUE;
        int Des_len = Integer.MIN_VALUE;
        st1.push(nums[0]);  
        for(int i = 1;i<n;i++){
         if(st1.peek()<nums[i]){
           st1.push(nums[i]);   
           }
           else{
            In_len = Math.max(In_len,st1.size());
            st1.clear();
            st1.push(nums[i]);
           }
        
        }

         In_len = Math.max(In_len,st1.size());

        // for the decreasing order
         Stack<Integer> st2 = new Stack<>();
         st2.push(nums[0]);  

        for(int i = 1;i<n;i++){
         if(st2.peek()>nums[i]){
           st2.push(nums[i]);   
           }
           else{
            Des_len = Math.max(Des_len,st2.size());
            st2.clear();
            st2.push(nums[i]);
           }
        }

        Des_len = Math.max(Des_len,st2.size());

        return Math.max(Des_len,In_len);


    }
}