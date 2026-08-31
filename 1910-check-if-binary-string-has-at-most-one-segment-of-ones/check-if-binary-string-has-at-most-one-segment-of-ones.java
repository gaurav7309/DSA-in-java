class Solution {
    public boolean checkOnesSegment(String s) {
    Stack<Character> st = new Stack<>();
    int n = s.length();
    int t = 0;
    for(int i = 0;i<n;i++){
    st.push(s.charAt(i));
    }
    // pop out the ele of the stack
    while(!st.isEmpty()){
     char tar = st.pop();
     if(tar=='1'){
        t++;
    while(!st.isEmpty() && st.peek()=='1'){
        st.pop();
     }
    }
    }
     if(t<=1){
        return true;
     }   
     else{
        return false;
     }
    }
}