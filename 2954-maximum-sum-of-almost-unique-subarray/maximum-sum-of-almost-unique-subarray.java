class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
     int n = nums.size();
     ArrayList<Integer> arr = new ArrayList<>();

     HashMap<Integer,Integer> mp = new HashMap<>();
     long max = Long.MIN_VALUE;
     long sum = 0;
     for(int i = 0;i<k;i++){
     arr.add(nums.get(i));
     sum+=(long)nums.get(i);
     mp.put(nums.get(i),mp.getOrDefault(nums.get(i),0)+1);

     }   
     if(mp.size()>=m){
     max = Math.max(max,sum);
     }
     for(int i = k;i<n;i++){
     int temp = arr.get(0);
     arr.remove(0);
     sum-=(long)temp;
     sum+=(long)nums.get(i);
     arr.add(nums.get(i));
     mp.put(temp,mp.get(temp)-1);
     if(mp.get(temp)==0){
        mp.remove(temp);
     }
      mp.put(nums.get(i),mp.getOrDefault(nums.get(i),0)+1);
      if(mp.size()>=m){
        max = Math.max(max,sum);
      }
     }
     return max==Long.MIN_VALUE?0:max;
    }
}