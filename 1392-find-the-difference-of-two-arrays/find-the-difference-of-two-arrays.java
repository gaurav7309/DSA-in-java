class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     int n = nums1.length;
     int m = nums2.length;
     HashMap<Integer,Integer>mp1 = new HashMap<>();
     HashMap<Integer,Integer>mp2 = new HashMap<>(); 

     List<List<Integer>> ans = new ArrayList<>();
     for(int i = 0;i<n;i++){
     mp1.put(nums1[i],mp1.getOrDefault(nums1[i],0)+1);

    }  
    for(int i = 0;i<m;i++){
     mp2.put(nums2[i],mp2.getOrDefault(nums2[i],0)+1);
     
    } 
    // contiains  check to each other
    ArrayList<Integer> a1 = new  ArrayList<>();
    ArrayList<Integer> b1 = new ArrayList<>();
    for(int  key : mp1.keySet()){
    if(!mp2.containsKey(key)){
    a1.add(key);
    }
    }
    ans.add(a1);
    //  in the nums2 there is no eleemnt that is the present in int nums1
    for(int  key : mp2.keySet()){
    if(!mp1.containsKey(key)){
    b1.add(key);
    }
    }
    ans.add(b1);
    return ans;
    }
}