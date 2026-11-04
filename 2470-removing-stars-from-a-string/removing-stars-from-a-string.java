class Solution {
    public String removeStars(String s) {
       Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
       int n = s.length();

       for(int i = 0;i<n;i++){
        if(s.charAt(i)=='*' && st.size()!=0){
        st.pop();
        }
        else{
        st.push(s.charAt(i));
        }
       } 
       String ans = "";
      while(!st.isEmpty()){
      st1.push(st.pop());
      }

      while(!st1.isEmpty()){
      ans+=st1.pop();
      }
      return ans;


    }
}