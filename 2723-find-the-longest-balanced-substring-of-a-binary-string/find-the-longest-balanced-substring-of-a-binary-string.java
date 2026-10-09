class Solution {
    public int findTheLongestBalancedSubstring(String s) {
    int n = s.length();
    int max = 0;
    for(int i =  0;i<n;i++){
         if(s.charAt(i)=='1'){
               continue;
            }
        
        String temp = "";
        int zero = 0;
        int one = 0;
        for(int j = i;j<n;j++){
          if(s.charAt(j)=='0'){
            zero++;
            temp+=s.charAt(j);
          } 
           else{
            one++;
            temp+=s.charAt(j);
           }
           if(one==zero){
           int   flag = 0;
           for(int k = 0;k<temp.length()-1;k++){
           if(temp.charAt(k)!=temp.charAt(k+1)){
           flag++;
           }
           else if (temp.charAt(k)==temp.charAt(k+1)){
           continue;
           }
           
           }
           if(flag==1){
           max = Math.max(max,one+zero);
           }
           }
            }
        }
    
    return max;
    }
}