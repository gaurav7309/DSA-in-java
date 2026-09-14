class Solution {
    public boolean strongPasswordCheckerII(String password) {
      int n = password.length();
      if(n<8){
        return false;
      }  
      int small = 0; int capital = 0; int dig = 0; int spe = 0;
     for(int i = 0;i<n;i++){
     if(i>0 && password.charAt(i)==password.charAt(i-1)){
        return false;
     }
     else if((password.charAt(i)>='a' && password.charAt(i)<='z')){
     small++;
     }
     else if((password.charAt(i)>='A' && password.charAt(i)<='Z')){
     capital++;   
     }
     else if((password.charAt(i)>='0' && password.charAt(i)<='9')){
     dig++;
     }
     //32–47, 58–64, 91–96, 123–126
     else if((password.charAt(i)-'0'>=32 && password.charAt(i)-'0'<=47) || (password.charAt(i)-'0'<=58 && password.charAt(i)-'0'>=64) ||  (password.charAt(i)-'0'>=91 && password.charAt(i)-'0'<=96) || (password.charAt(i)-'0'<=123 && password.charAt(i)-'0'<=126 )){
        spe++;
     }
     }
     if(small>0 && capital>0 && dig>0 && spe>0){
        return true;
     }
     else{
        return false;
     }
    }
}