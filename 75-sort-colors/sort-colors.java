class Solution {
    public void sortColors(int[] nums) {
     // count the number of the one and the zero and the two
     int n = nums.length;
     int one = 0;int zero = 0; int two = 0;
     for(int i = 0;i<n;i++){
     if(nums[i]==0){
        zero++;
     }
     else if(nums[i]==1){
        one++;
     }
     else{
        two++;
     }
     }  
   
     int i = 0;
       while(i<zero){
     nums[i]  = 0;
     i++;
     } 
        while(i<one+zero){
     nums[i]  = 1;
     i++;
     }   while(i<one+two+zero){
     nums[i]  = 2;
     i++;
     }
    
    
    }
}