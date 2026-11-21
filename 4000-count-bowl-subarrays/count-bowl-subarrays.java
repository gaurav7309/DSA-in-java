class Solution {
    static int[] nge;
    static int[] pge;
    static Stack<Integer> st;
    //m for finsing the nge 
    public static int [] next_greater_ele(int[] nums){
    int n   = nums.length;
    for(int i = 0;i<n;i++){
        while(!st.isEmpty() && nums[i]>nums[st.peek()]){
            nge[st.peek()] = i;
            st.pop();
        }
        st.push(i);
    }
    st.clear();
    return nge;
    }
    // for findong the pre greater value  
  
    public static int [] pre_greater_ele(int[] nums){
    int n   = nums.length;
    for(int i = n-1;i>=0;i--){
        while(!st.isEmpty() && nums[i]>nums[st.peek()]){
            pge[st.peek()] = i;
            st.pop();
        }
        st.push(i);
    }
    st.clear();
    return pge;
    }
    public long bowlSubarrays(int[] nums) {
        int n = nums.length;
        nge = new int[n];
        pge = new int[n];
       java.util.Arrays.fill(nge,-1);
       java.util.Arrays.fill(pge,-1);
       
       st = new Stack<>();
       next_greater_ele(nums);
       pre_greater_ele(nums);

    // int n = nums.length;
    int ans = 0;
    for(int i = 0;i<n;i++){
        if(nge[i]!=-1 && pge[i]!=-1){
        int min = Math.min(nums[nge[i]],nums[pge[i]]);
        if(min>nums[i]){
            ans++;
        }
        }
    }
    return ans;
    }
}