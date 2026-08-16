class Solution {
    public int compress(char[] chars) {
        int n = chars.length;

        if (n == 1) {
            return 1;
        }

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        int index = 0;
        int i = 0;

        while (i < n) {

            char ch = chars[i];
            map.clear();

            // Count consecutive characters
            while (i < n && chars[i] == ch) {
                if (map.containsKey(ch)) {
                    int x = map.get(ch);
                    map.put(ch, x + 1);
                } else {
                    map.put(ch, 1);
                }
                i++;
            }

            // Put character
            chars[index++] = ch;

            // Get its count
            int count = map.get(ch);

            // Put count digits
            if (count > 1) {
                String s = String.valueOf(count);

                for (int j = 0; j < s.length(); j++) {
                    chars[index++] = s.charAt(j);
                }
            }
        }

        return index;
    }
}