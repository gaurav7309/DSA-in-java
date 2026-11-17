class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> st = new  HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0;i<n;i++){
        int low  = i+1;
        int high = n-1;
        while(low<high){

            if(nums[i]+nums[low]+nums[high]==0){
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]); temp.add(nums[low]); temp.add(nums[high]);
            st.add(temp);
            low++;
            high--;
            }
            else if(nums[i]+nums[low]+nums[high]<0){
                low++;
            }
            else{
                high--;
            }
        }
        }

        // convert all the element to the kist .list
        List<List<Integer>> ans = new ArrayList<>();

        for(List<Integer> ele:st){
            ans.add(ele);
        }
        return ans;
    }
}