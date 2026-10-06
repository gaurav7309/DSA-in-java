class Solution {
    public int minSwaps(String s) {
    Stack<Character> st = new Stack<>();
    int n = s.length();
    for(int i = 0;i<n;i++){
     if(!st.isEmpty() && s.charAt(i)==']' && st.peek()=='['){
        st.pop();
     }    
     else{
        if(s.charAt(i)=='[')
        st.push(s.charAt(i));
     }
    } 
    if(st.size()==0){
        return 0;
    }  
  
    return (st.size()+1)/2;

   
    }
}