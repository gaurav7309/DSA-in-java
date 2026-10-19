
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = fruits.length;
        int i = 0;
        int max = 0;

        for(int j = 0; j < n; j++) {
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);
            while(mp.size() > 2) {
                mp.put(fruits[i], mp.get(fruits[i]) - 1);

                if(mp.get(fruits[i]) == 0) {
                    mp.remove(fruits[i]);
                }
                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
