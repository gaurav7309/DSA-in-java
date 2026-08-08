class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
       int n = nums.length;
       ArrayList<Integer> ans = new ArrayList<>();
       int max = nums[0];
       for(int i =  0;i<nums.length;i++){
       if(max<nums[i]){
        max = nums[i];
       }
       }
       int arr[] = new int[max+1];
       for(int i = 0;i<nums.length;i++){
       int t = nums[i];
       arr[t]++; 
       }
       for(int i = 0;i<arr.length;i++){
        if(arr[i]>k){
            arr[i] = k;
        }
       }
       for(int i = 0;i<nums.length;i++){
        int t = nums[i];
        if(arr[t]>0){
            ans.add(t);
            arr[t]--;
        }
       }
      
       int result[] = new int[ans.size()];
       for(int i = 0;i<ans.size();i++){
       result[i] = ans.get(i);
       }
       return result; 
    }
}