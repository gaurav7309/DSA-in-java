class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
     int n = nums1.length;
     HashMap<Integer,Integer> set1 = new HashMap<>();
     HashMap<Integer,Integer> set2 = new HashMap<>();
     for(int i =  0;i<n;i++){
        
        for(int j = 0;j<n;j++){
        int sum1 = nums1[i]+nums2[j];   
        set1.put(sum1,set1.getOrDefault(sum1,0)+1);  
        }
        }
      
       for(int i =  0;i<n;i++){
        
        for(int j = 0;j<n;j++){
         int sum = nums3[i]+nums4[j]; 
           set2.put(sum,set2.getOrDefault(sum,0)+1); 
        }
     } 
     int c =  0;
     for(int ele1 :set1.keySet()){
     if(set2.containsKey(-ele1)){
     c+=set1.get(ele1)*set2.get(-ele1);
    }
     }
     
     return c;   
    }
}