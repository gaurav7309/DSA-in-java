class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int n = nums.length;
      int [] arr = new int[n];
      for(int i = 0;i<n;i++){
      arr[i] = -1;
      for(int j =  i;j<i+n;j++){
       
        if(nums[i]<nums[(j+1)%n]){
        arr[i] = nums[(j+1)%n];
        break;
        }
      }
     
      
      }  
      return arr;
    }
}