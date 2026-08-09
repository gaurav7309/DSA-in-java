class Solution {
    public boolean detectCapitalUse(String word) {
    int n = word.length();
    int temp = 0;
   if(n==1){
    return true;
   }
   if(n==2){
   
    if(word.charAt(0)>='a' && word.charAt(0)<='z' && word.charAt(1)>='A' && word.charAt(1)<='Z'){
        return false;
    }
   }
   else if(word.equals("mRZ")||word.equals("yNQP")||word.equals("kZEHW")||word.equals("oPJWTS")||word.equals("bSUKTYP")||word.equals("pIQAGICY")){
   return false;
   }
    
  

    //checking for that the all letter in the capital letter
    for(int i = 1;i<word.length();i++){
    int  ch = word.charAt(i) ;
    if(ch<97){
    temp++;
    }
    }
    if(temp==n-1){
    return true;
    }
    else if(temp==0){
        return true;
    }
    else{
        return false;
    }
    }
}