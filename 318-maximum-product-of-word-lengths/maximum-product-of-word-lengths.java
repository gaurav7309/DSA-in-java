class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int max = 0;

        int[] mask = new int[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                mask[i] = mask[i] | (1 << (words[i].charAt(j) - 'a'));
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if((mask[i] & mask[j]) == 0) {

                    int product = words[i].length() * words[j].length();

                    if(product > max) {
                        max = product;
                    }
                }
            }
        }

        return max;
    }
}