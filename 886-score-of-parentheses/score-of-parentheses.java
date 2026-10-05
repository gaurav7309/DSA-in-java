class Solution {
    public int scoreOfParentheses(String s) {
    int   n = s.length();
  
    Stack<Character> st = new Stack<>();
    int sum = 0;
    int count = 0;
    for(int i = 0;i<n;i++){
    if(s.charAt(i)=='('){
    st.add(s.charAt(i));
    count++;
    }
    else if(s.charAt(i)==')'){
        st.pop();
       count--;
       if(s.charAt(i-1)=='('){
        sum = sum+(int)Math.pow(2,count);
       }
    }

    }
       
    return sum; 
    }
}