class Solution {
    public int maximumProduct(int[] nums, int k) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        int n = nums.length;
        int modulo = 1000000007;

        for(int i = 0; i < n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        for(int i = 0; i < k; i++){
            int val = mp.firstKey();
            mp.put(val, mp.get(val) - 1);
            
            if(mp.get(val) == 0){
                mp.remove(val);
            }
            mp.put(val + 1, mp.getOrDefault(val + 1, 0) + 1);
        }

        long pro = 1;

        for(int key : mp.keySet()){
            int freq = mp.get(key);

            for(int i = 1; i <= freq; i++){
                pro = (pro * key) % modulo;
            }
        }

        return (int)pro;
    }
}