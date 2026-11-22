class Solution {
    public boolean checkString(String s) {
       int n =  s.length();
       for(int i = 0;i<n-1;i++){
        char s1 = s.charAt(i);
        char s2 = s.charAt(i+1);
        if(s1=='b' && s2=='a'){
            return false;
        }
       }
       return true;
    }
}