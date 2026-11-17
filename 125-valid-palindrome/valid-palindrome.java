class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder st = new StringBuilder();
       int n = s.length();
       for(int i = 0;i<n;i++){
       if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
        st.append(Character.toLowerCase(s.charAt(i)));
       }
       else if( s.charAt(i)>='a'&&  s.charAt(i)<='z'  ){
         st.append(s.charAt(i));
       }
       else if( s.charAt(i)>='0' && s.charAt(i)<='9'){
       st.append(s.charAt(i));
       }


       } 
       int p  = 0;
       int q = st.length()-1;
       while(p<q){
        if(st.charAt(p)!=st.charAt(q)){
            return false;
        }
        p++;
        q--;
       }
       return true;
    }
}