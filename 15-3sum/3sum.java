class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> st  = new HashSet<>();
        Arrays.sort(nums);
        for(int  i = 0;i<n;i++){
            int p = i+1;
            int q = n-1;
            while(p<q){
               
                if(nums[i]+nums[p]+nums[q]==0){
                   List<Integer> check = new ArrayList<Integer>();
                   check.add(nums[p]); check.add(nums[q]); check.add(nums[i]); 
                   st.add(check);
                   p++;
                   q--;
                }
                else if(nums[i]+nums[p]+nums[q]<0){
                    p++;
                }
                else{
                    q--;
                }
            }
        }
        // the  conver the st tot he arraylost
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> key: st){
        ans.add(key);
        } 
     return ans;
    }
}