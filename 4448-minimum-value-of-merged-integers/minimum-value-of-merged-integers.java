class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++){
            ans[i] = Integer.toString(nums[i]);
        }

        ArrayList<Long> ans1 = new ArrayList<>();

        for(int i = 0; i < n-1; i+=2){
            ans1.add(Long.parseLong(ans[i] + ans[i+1]));
        }

        long min = Long.MAX_VALUE;

        for(int i = 0; i < ans1.size(); i++){
            min = Math.min(min, ans1.get(i));
        }

        return (int)min;
    }
}