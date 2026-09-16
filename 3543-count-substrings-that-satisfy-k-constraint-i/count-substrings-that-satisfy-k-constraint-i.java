class Solution {
    public int countKConstraintSubstrings(String s, int k) {
     int n = s.length();
     int count = 0;
     for(int i = 0;i<n;i++){
        int one  = 0;
        int zero = 0;
     for(int j = i;j<n;j++){
       if(s.charAt(j)=='0'){
        zero++;
       }
       else if(s.charAt(j)=='1'){
        one++;
       }
       if(zero<=k || one<=k){
       count++;
       }
     }
     }  
     return count; 
    }
}