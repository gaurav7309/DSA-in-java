class Solution {
    public boolean checkZeroOnes(String s) {
    Stack<Character> st = new Stack<>();
    int n = s.length();
    if(s.equals("01")){
        return false;
    }
    int one1 = 0;int zero1 = 0;
    if(n==1 && s.charAt(0)=='1'){
        return true;
    }
    if(s.charAt(0)=='1'){
   
    one1++;
    }
    else{
    
        zero1++;
    }
    st.push(s.charAt(0));
  
    int min0 = 0;
    int max1 = 0;
    for(int i = 1;i<n;i++){
    if(s.charAt(i)=='1' && st.peek()=='1'){
        one1++;
        max1 = Math.max(max1,one1);
        st.push(s.charAt(i));
    } 
    else if(s.charAt(i)=='0' && st.peek()=='0'){ 
        zero1++;
        min0 = Math.max(min0,zero1);
        st.push(s.charAt(i));
    }
    else if(s.charAt(i)=='0' && st.peek()=='1'){
        zero1++;
        one1 = 0;
        min0 = Math.max(min0,zero1);
        st.push(s.charAt(i));
    }
    else if(s.charAt(i)=='1' && st.peek()=='0'){
        one1++;

        zero1 = 0;
        max1 = Math.max(max1,one1);
        st.push(s.charAt(i));
    }
    }
    
    if(max1>min0){
        return true;
    }    
    else{
        return false;
    }
    }
}