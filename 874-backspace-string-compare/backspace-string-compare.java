class Solution {
    public boolean backspaceCompare(String s, String t) {
    Stack<Character> st1 = new Stack<>();
    Stack<Character> st2 = new Stack<>();    
    int n1 = s.length(); 
    int n2 = t.length();
    for(int i = 0;i<n1;i++){
        if(!st1.isEmpty() && s.charAt(i)=='#'){
            st1.pop();

        }
        else if(s.charAt(i)!='#'){
            st1.push(s.charAt(i));
        }
    }
    for(int i = 0;i<n2;i++){
        if(!st2.isEmpty() && t.charAt(i)=='#'){
            st2.pop();
        }
        else if( t.charAt(i)!='#'){
            st2.push(t.charAt(i));
        }
    }
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    while(!st1.isEmpty()){
        s1.append(st1.pop());
    }
    while(!st2.isEmpty()){
        s2.append(st2.pop());
    }
    String ans1 = s1.toString();
       String ans2 = s2.toString();
       if(ans1.equals(ans2)){
        return true;
       }
       else{
        return false;
       }
    }
}