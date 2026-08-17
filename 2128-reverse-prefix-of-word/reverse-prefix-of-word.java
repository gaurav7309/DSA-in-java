class Solution {
    public String reversePrefix(String word, char ch) {
    int n = word.length();
    Stack<Character> st = new Stack<>();

    StringBuilder s = new StringBuilder();

    for(int i = 0;i<n;i++){

    if(word.charAt(i)==ch){

    st.push(word.charAt(i));
    while(!st.isEmpty()){
    s.append(st.pop());
    }
    for(int j = i+1;j<n;j++){
        s.append(word.charAt(j));
    }
    return s.toString();
    }
    
        st.push(word.charAt(i));
    
    }
    StringBuilder  p = new StringBuilder();
    while(!st.isEmpty()){
    p.append(st.pop());
    } 
    p.reverse();
    return p.toString();
    }
}