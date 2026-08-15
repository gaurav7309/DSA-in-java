class Solution {
    public int findLHS(int[] nums) {
     int n = nums.length;
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i =  0;i<n;i++){
     if(map.containsKey(nums[i])){
        int x = map.get(nums[i]);
        map.put(nums[i],x+1);
     }
     else{
        map.put(nums[i],1);
     }
     }
     int max = 0;
     for(int i : map.keySet()){
       if(map.containsKey(i+1)){
        max = Math.max(map.get(i)+map.get(i+1),max);
       } 
     }  
     return max;
    }
}