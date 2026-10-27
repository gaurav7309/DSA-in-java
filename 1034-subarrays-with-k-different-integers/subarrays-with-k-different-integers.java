class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
        }
       public static int atmost(int [] nums,int k){
       HashMap<Integer,Integer> mp = new HashMap<>();
       
       int n = nums.length;
       int ansF = 0;
       int start = 0;
       for(int end = 0;end<n;end++){
        
       mp.put(nums[end],mp.getOrDefault(nums[end],0)+1);
       
       while(mp.size()>k){
      
       int temp = nums[start];
      
        mp.put(temp,mp.get(temp)-1);
        if(mp.get(temp)==0){
            mp.remove(temp);
        }
        
       start++;
       }
       ansF+=end-start+1;
       } 
       return ansF;


    // int n = nums.length;
    // int nas = 0;
    // for(int i = 0;i<n;i++){
    // HashMap<Integer,Integer> mp = new HashMap<>();  
    // for(int j = i;j<n;j++){
    //  mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
    //  if(mp.size()==k){
    // nas++;
    //  }
    // }
    // }
    // return nas;
    }
}