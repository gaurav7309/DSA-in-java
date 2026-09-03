class Solution {
    public int maximumPossibleSize(int[] nums) {
     Stack<Integer> st = new Stack<>();
     int n = nums.length;
     st.push(nums[0]);
     for(int i = 1;i<n;i++){
     if(st.peek()<=nums[i]){
     st.push(nums[i]);
     } 
     } 
     return st.size(); 
    }
}