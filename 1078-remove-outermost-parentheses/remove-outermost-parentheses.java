class Solution {
    public String removeOuterParentheses(String s) {
      int n = s.length();
      int c = 0;
      String st = "";
      for(int i = 0;i<n;i++){
        if(s.charAt(i)=='('){
            c++;
            if(c!=1){
            st+='(';
            }
        }
        else if(s.charAt(i)==')'){
            c--;
            if(c!=0){
                st+=')';
            }
        }
      } 
      return st; 
    }
}