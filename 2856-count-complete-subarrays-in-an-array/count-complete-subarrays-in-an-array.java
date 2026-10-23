class Solution {
    public int countCompleteSubarrays(int[] nums) {
      int n = nums.length;
      HashSet<Integer> st1 = new HashSet<>();
      for(int i = 0;i<n;i++){
      st1.add(nums[i]);
      }
      int ans = 0;
    for(int i = 0;i<n;i++){
        HashSet<Integer> st = new HashSet<>();
        for(int j = i;j<n;j++){
         st.add(nums[j]);
          if(st.size()==st1.size()){
         ans++;   
        }
        }
       
    }
    return ans;    
    }
}