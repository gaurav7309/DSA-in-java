class Solution {
    public String makeGood(String s) {
     int n = s.length();
     Stack<Character> st = new Stack<>();
      st.push(s.charAt(0));
     for(int i = 1;i<n;i++){
        char t = s.charAt(i);
        if(!st.isEmpty() && Math.abs(st.peek()-t)==32){
           st.pop();
        }
        else{
          st.push(t);
        }
     } 
     StringBuilder ans = new  StringBuilder();
     while(!st.isEmpty()){
        ans = ans.append(st.pop());
     }  
     //  reverse the string 
     return ans.reverse().toString();
    }
}