class Solution {
    public int maxScore(String s) {
     int n = s.length();
     int max = Integer.MIN_VALUE;
     for(int i = 0;i<n-1;i++){
        int zero = 0;
        int one = 0;
     for(int j  = 0;j<=i;j++){
     if(s.charAt(j)=='0'){
     zero++;
     }
     }
     for(int k = i+1;k<n;k++){
     if(s.charAt(k)=='1'){
        one++;
     }

     }
     int ans = zero+one;
     max = Math.max(max,ans);
     }  
     return max; 
    }
}