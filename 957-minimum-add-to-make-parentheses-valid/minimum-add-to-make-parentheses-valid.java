class Solution {
    public int minAddToMakeValid(String s) {
      int n = s.length();
      int c = 0;
      Stack<Character> st = new Stack<>();
      for(int i = 0;i<n;i++){
      if(s.charAt(i)=='('){
        st.push(s.charAt(i));
      }
      else if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='('){
        st.pop();
      }  
      else {
        st.push(s.charAt(i));
      }
    } 
    // after the complition of the for loop we have to check howmany character are the come corresponding them use the valid pranthesis
    // check whether the howmany ( are the come and the howmany are the )
    // are the come
    int left = 0;
    int right = 0;
    while(!st.isEmpty()){
        char temp = st.pop();
        if(temp=='('){
         left++;
        }
        else{
            right++;
        }
    }
    c+=left;
    c+=right;
    return c;
    }
}