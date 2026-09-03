class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
     Stack<String> st = new Stack<>();
     for(int i = 0;i<n;i++){
     String temp = tokens[i];
     if(temp.equals("+") || temp.equals("-") ||temp.equals("*") || temp.equals("/") && st.size()>=2){
       String y = st.pop();
       int y1 = Integer.parseInt(y);
       String x = st.pop();
       int x1 = Integer.parseInt(x);
       int ans = 0;
       if(temp.equals("+")){
        ans = x1+y1;
       }
       else if(temp.equals("-")){
        ans = (x1-y1);
       }
       else if(temp.equals("*")){
       ans =  x1*y1;
       }
       else{
       
        if(y1!=0){
        ans = x1/y1;
       }
       }
        st.push(Integer.toString(ans));
     }
      else{
        st.push(temp);
      }
     } 
     String r = st.pop();
     int re = Integer.parseInt(r);
     return re; 

    }
}