class Solution {
   
    public boolean isPalindromic(String s) {
     String ans = "";
     int n = s.length();
     for(int i = 0;i<n;i++){
     int temp = s.charAt(i);   
     String binary = Integer.toBinaryString(temp);
     while(binary.length()<8){
      ans +=(0+binary);
      break;  
     }
     }
     int p = 0; int q = ans.length()-1;
     while(p<q){
      if(ans.charAt(p)!=ans.charAt(q)){
      return false;   
      } 
      p++;
      q--; 
     }
     return true;
    }
}