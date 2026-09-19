class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int[] stack = new int[n];
        int[] steps = new int[n];
        int top = -1;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int step = 0;
            while(top >= 0 && nums[stack[top]] <= nums[i]) {
                step = Math.max(step, steps[stack[top]]);
                top--;
            }
            if(top >= 0) {
                step++;
                ans = Math.max(ans, step);
            }
            steps[i] = step;
            stack[++top] = i;
        }

        return ans;
    }
}