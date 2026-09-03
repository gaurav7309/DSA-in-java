class Solution {
    public String clearDigits(String s) {
     Stack<Character> st = new Stack<>();
     int n = s.length();
     for(int i = 0;i<n;i++){
      if(s.charAt(i)>='0' && s.charAt(i)<='9'){
        if(!st.isEmpty()){
            st.pop();
        }
      }
      else{
        st.push(s.charAt(i));
      }  
     }
      StringBuilder se = new StringBuilder();
      while(!st.isEmpty()){
      se = se.append(st.pop());  
      }   
      return se.reverse().toString();
    }
}