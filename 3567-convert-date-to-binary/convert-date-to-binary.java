class Solution {

    String bit(String n) {
        int ans = Integer.parseInt(n);
        StringBuilder temp = new StringBuilder();
        while (ans != 0) {
            temp.append(ans % 2);
            ans /= 2;
        }
        return rev(temp.toString());
    }
    String rev(String s) {
        StringBuilder temp = new StringBuilder(s);
        int p = 0;
        int q = temp.length() - 1;
        while (p < q) {
            char x = temp.charAt(p);
            temp.setCharAt(p, temp.charAt(q));
            temp.setCharAt(q, x);
            p++;
            q--;
        }
        return temp.toString();
    }

    public String convertDateToBinary(String date) {
        int n = date.length();
        StringBuilder result = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (date.charAt(i) != '-') {
                str.append(date.charAt(i));
            }
            if (date.charAt(i) == '-' || i == n - 1) {
                result.append(bit(str.toString()));
                if (date.charAt(i) == '-') {
                    result.append('-');
                }
                str.setLength(0);
            }
        }
        return result.toString();
    }
}