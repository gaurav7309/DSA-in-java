class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
    int n  = nums.size();
    int[] prefixSum = new int[102];
    for(List<Integer> num : nums){
        int left = num.get(0);
        int right = num.get(1);
        prefixSum[left]+= 1;
        prefixSum[right+1]-=1;
    }
    for(int i = 1;i<prefixSum.length;i++){
        prefixSum[i] = prefixSum[i-1]+prefixSum[i];
    }
    int count = 0;
    for(int i = 1;i<prefixSum.length;i++){
        if(prefixSum[i]!=0){
        count+=1;
        }
    }
    return count;
    }
}