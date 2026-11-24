class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int p = 0;
        int q = n-1;
       while(p<q){
      char temp = s[p];
      s[p] = s[q];
      s[q] = temp;
      p++; q--;
       }
    // return s;
    }
}