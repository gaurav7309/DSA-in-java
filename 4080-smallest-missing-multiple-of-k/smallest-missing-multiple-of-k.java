class Solution {
    public int missingMultiple(int[] nums, int k) {
     int n  = nums.length;
     HashSet<Integer> set = new HashSet<>();
    for(int ele: nums){
     set.add(ele);
     }  
     int p = 1;
     for(int ele:set){
        if(set.contains(k*p)){
        p++;
        }else{
            return k*p;
        }
     }
     return  k*p;
    }
}