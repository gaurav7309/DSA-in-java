class Solution {
    public String sortString(String s) {
        int n = s.length();
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        String ans = "";
        int q = 0;
        while (q < n) {
            for (int i = 0; i < arr.size();) {
                char ch = arr.get(i);
                ans += ch;
                arr.remove(i);
                q++;
                while (i < arr.size() && arr.get(i) == ch) {
                    i++;
                }
            }
            Collections.sort(arr, Collections.reverseOrder());

            for (int i = 0; i < arr.size();) {
                char ch = arr.get(i);
                ans += ch;
                arr.remove(i);
                q++;
                while (i < arr.size() && arr.get(i) == ch) {
                    i++;
                }
            }
            Collections.sort(arr);
        }

        return ans;
    }
}