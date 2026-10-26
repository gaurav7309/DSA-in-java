class Solution {
    public int findMiddleIndex(int[] nums) {
       int [] prefix = new int[nums.length];
       prefix[0] = nums[0];
     
        int n = nums.length;
        if(n==1){
         return 0;
       }
       for(int i = 1;i<n;i++){
       prefix[i] = nums[i]+prefix[i-1];
       }

      for(int i  = 0;i<n;i++){
         if( i==n-1 && prefix[i-1]==0){
            return i;
        }
         else if(i==0 && prefix[n-1]-prefix[i]==0){
        return i;
       }
        else if(i>0 &&  prefix[i-1]==prefix[n-1]-prefix[i]){
            return i;
        }
      
       
        }
      
      return -1;
    }
}