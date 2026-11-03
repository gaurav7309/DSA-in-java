class Solution {
    public static ArrayList<Integer> prime(int n){

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                
                arr.add(i);
                while(n%i==0){
                n/=i;
            }
        }
        }
        if(n>1){
            arr.add(n);
        }
        
        return arr;
    }
    public int longestSubarray(int[] nums, int k) {
        int  n  = nums.length;
        int start = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int end = 0;end<n;end++){

        ArrayList<Integer> temp1 = new ArrayList<>(prime(nums[end]));

        for(int i = 0;i<temp1.size();i++){
            map.put(temp1.get(i),map.getOrDefault(temp1.get(i),0)+1);
        }

        if(map.size()>k && start<=end){

         ArrayList<Integer> temp2 = new ArrayList<>(prime(nums[start]));
         for(int i = 0;i<temp2.size();i++){
           int t = temp2.get(i);
           map.put(t,map.get(t)-1);
           if(map.get(t)==0){
            map.remove(t);
           }
        }
          start++;

        }

        
         
        max = Math.max(max,end-start+1);
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}