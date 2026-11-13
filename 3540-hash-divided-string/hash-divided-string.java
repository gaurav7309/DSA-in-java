class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i  = 0;i<n;i+=k){
            String temp   = s.substring(i,i+k);
            int j  = 0;
            int memp  = 0;
            while(j<k){
        //    ans.append()
            memp+=(temp.charAt(j)-'a')%97;
            j++;
            }
            memp%=26;
            ans.append((char)(memp + 'a'));
        }
        return ans.toString();
    }
}