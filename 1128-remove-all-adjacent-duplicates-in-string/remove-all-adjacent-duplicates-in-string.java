class Solution {
    public String removeDuplicates(String s) {
    Stack<Character> st = new Stack<>();
    int n = s.length();
    st.push(s.charAt(0));
    for(int i =  1;i<n;i++){
    if( !st.isEmpty() && st.peek()==s.charAt(i) ){
        st.pop();
    }
    else{
        st.push(s.charAt(i));
    }
    }
    StringBuilder st1 = new StringBuilder();
    while(!st.isEmpty()){
        st1.append(st.pop());
    }   
    return st1.reverse().toString(); 
    }
}