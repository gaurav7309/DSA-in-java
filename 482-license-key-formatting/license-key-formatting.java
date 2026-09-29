class Solution {
    String rev(String s){
     StringBuilder st = new StringBuilder(s);   
     int p = 0; int q = st.length()-1;
    while(p<q){ 
    char temp = st.charAt(p);
    st.setCharAt(p,st.charAt(q));
    st.setCharAt(q,temp);
    p++;
    q--;
    }
    return st.toString();
    }
    public String licenseKeyFormatting(String s, int k) {
     StringBuilder st = new StringBuilder();   
     for(int i = 0;i<s.length();i++){
        if(s.charAt(i)!='-'){
        st = st.append(s.charAt(i));
        }
     }
     // find the length
     StringBuilder ans = new StringBuilder();
     int p = 0;
     for(int i = st.length()-1;i>=0;i--){
        char temp = st.charAt(i);
        if(temp>='a' && temp<='z'){
            temp = Character.toUpperCase(temp);
        }
        p++;
     ans = ans.append(temp);
     if(p==k){
        ans.append('-');
        p=0;
     }
     }
     if(ans.length()>0 && ans.charAt( ans.length()-1)=='-'){
        ans.deleteCharAt( ans.length()-1);
     }
     String re = ans.toString();

     return rev(re);
    }
}