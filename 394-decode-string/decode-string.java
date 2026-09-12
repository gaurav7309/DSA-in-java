class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        String ans = "";
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
            else if(ch == '[') {
                st1.push(num);
                st2.push(ans);
                num = 0;
                ans = "";
            }
            else if(ch == ']') {
                int x = st1.pop();
                String temp = st2.pop();
                for(int j = 0; j < x; j++) {
                    temp = temp + ans;
                }
                ans = temp;
            }
            else {
                ans = ans + ch;
            }
        }
        return ans;
    }
}

