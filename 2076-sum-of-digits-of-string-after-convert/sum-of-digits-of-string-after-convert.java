class Solution {
    public int getLucky(String s, int k) {

        int n = s.length();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int x = s.charAt(i);
            ans.append(x - 96);
        }

        int sum = 0;

        for (int i = 0; i < ans.length(); i++) {
            sum += ans.charAt(i) - '0';
        }

        for (int i = 1; i < k; i++) {

            int use = sum;
            sum = 0;

            while (use != 0) {
                sum += use % 10;
                use /= 10;
            }
        }

        return sum;
    }
}