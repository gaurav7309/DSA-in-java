class Solution {
    public String removeTrailingZeros(String num) {
    StringBuilder ans = new StringBuilder();
    int n = num.length();
    for(int i = n-1;i>=0;i--){
     if(num.charAt(i)=='0'){
      continue;  
     }
     else{
     for(int j = i;j>=0;j--){
        ans  = ans.append(num.charAt(j));
     }
     break;
     }
     
    }
    // revese the str
    int p = 0;int q = ans.length()-1;
    while(p<q){
        char temp = ans.charAt(p);
        ans.setCharAt(p,ans.charAt(q));
        ans.setCharAt(q,temp);
        p++;q--;
    }   
    return ans.toString(); 
    }
}