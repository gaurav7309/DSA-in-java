class Solution {
    String rev(String s){
        int  p = 0;
        int q = s.length()-1;
        StringBuilder st = new StringBuilder(s);
        while(p<q){
        char temp = st.charAt(p);
        st.setCharAt(p,st.charAt(q));
        st.setCharAt(q,temp);
        p++;
        q--;
        }
        return st.toString();
    }
    public String reverseByType(String s) {
    int n = s.length();
    String let = "";
    String spe = "";
    for(int i = 0;i<n;i++){
     if(s.charAt(i)>='a' && s.charAt(i)<='z'){
        let+=s.charAt(i);
     }
     else{
        spe+=s.charAt(i);
     }   
    }    
    String let1 = rev(let);
    String spe1 = rev(spe);
    String ans = "";
    int p = 0;
    int q = 0;

    for(int i  = 0;i<n;i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
        ans = ans+let1.charAt(p++);
        }
        else{
        ans  = ans+spe1.charAt(q++);
        }
    }
    return ans;
    }
}