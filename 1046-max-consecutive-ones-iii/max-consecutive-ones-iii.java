class Solution {
    public int longestOnes(int[] nums, int k) {
     int n = nums.length;
     //  first convert the array to the array list 
     ArrayList<Integer> arr = new ArrayList<>();

     for(int i = 0;i<n;i++){
     arr.add(nums[i]);
     }

     int one = 0;
     int zero = 0;
     int max = 0;
     int left =  0;
     for(int i = 0;i<n;i++){
     if(arr.get(i)==0){
        zero++;
     }
     else{
        one++;
     }
     if(zero<=k){
     max = Math.max(max,zero+one);
     }
     else{
     int temp  = arr.get(left++);
     if(temp==1){
        one--;
     }
     else{
        zero--;
     }

     }
     } 
     return max;  
    }
}