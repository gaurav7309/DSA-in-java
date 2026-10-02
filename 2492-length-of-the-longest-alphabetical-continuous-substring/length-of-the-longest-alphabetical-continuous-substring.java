class Solution {
    public int longestContinuousSubstring(String s) {
        /*1. first we have to implement the logic of the subarray
          2. in the second loop we have to check that the first +1 = second 
          3. if is happens then move forword otherwise stop and that mevement store the val
          4. then that val values wwe are store then find the max max value
          5. return it */
      int max = Integer.MIN_VALUE;
      int n = s.length();
      for(int i = 0;i<n;i++){
        int c = 1;
       for(int j = i;j<n-1;j++){
       int temp = (s.charAt(j)-'0');
       if(temp+1==s.charAt(j+1)-'0'){
       c++;
       }
       else{
        break;
       }
       }
        max = Math.max(max,c);
      }  
      return max;
    }
}