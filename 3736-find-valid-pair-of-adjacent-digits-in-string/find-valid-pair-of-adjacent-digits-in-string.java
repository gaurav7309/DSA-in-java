class Solution {

    public String findValidPair(String s) {

        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // checking the value = exact digit
        StringBuilder se = new StringBuilder();

        for(char ele : map.keySet()) {

            if(ele - '0' == map.get(ele)) {
                se.append(ele);
            }
        }

        String temp = se.toString();

        // checking adjacent characters in original string
        for(int i = 0; i < n - 1; i++) {

            if(temp.indexOf(s.charAt(i)) != -1 &&
               temp.indexOf(s.charAt(i + 1)) != -1 &&
               s.charAt(i) != s.charAt(i + 1)) {

                return "" + s.charAt(i) + s.charAt(i + 1);
            }
        }

        return "";
    }
}