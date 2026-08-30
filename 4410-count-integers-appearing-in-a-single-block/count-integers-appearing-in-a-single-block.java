
class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> bad = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                seen.add(nums[i - 1]);
            }

            if (seen.contains(nums[i])) {
                bad.add(nums[i]);
            }
        }

        HashSet<Integer> all = new HashSet<>();

        for (int x : nums) {
            all.add(x);
        }

        return all.size() - bad.size();
    }
}

