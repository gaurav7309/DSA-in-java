class Solution {
    public int countStaircase(int[] nums) {
       
      int n = nums.length ;
        int ans = 0;
        for(int i = 0;i<n;i++){
            LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
            
            for(int j = i;j<n;j++){
             mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);   
          
                int p = 1;
                boolean flag = true;
         
             for(int key:mp.keySet()){
                 if(mp.get(key)!=p){
                     flag = false;
                     break;  
                 }
                 p++;
             }
                if(flag){
                 ans++;   
                }
            
        }
        }
        return ans;
    }
}