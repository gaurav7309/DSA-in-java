class Solution {
    public int longestBalanced(int[] nums) {
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<n;i++){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int even  = 0;
        int odd = 0;
        for(int j = i;j<n;j++){
      
        if(nums[j]%2!=0){
            if(!mp.containsKey(nums[j])){
            odd++;
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            }
        }
        else if(nums[j]%2==0){
         if(!mp.containsKey(nums[j])){
         even++;
        mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
         }
            
        }
     
        if(even==odd){
        max = Math.max(max,j-i+1);
        }
        }
    }  
    return max==Integer.MIN_VALUE? 0 :max;  
    }
}