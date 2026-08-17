class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> st = new Stack<>();
    int n = operations.length;
    st.push(Integer.parseInt(operations[0]));

    for(int i = 1;i<n;i++){
    if(operations[i].equals("C")){
       st.pop(); 
    }
    else if(operations[i].equals("D")){
       st.push(st.peek()*2); 
    }
    else if(operations[i].equals("+")){
      int temp  = st.pop();
      int temp1 = st.peek();
      st.push(temp);
      st.push((temp+temp1));
    }
    else{
        st.push(Integer.parseInt(operations[i]));
    }
    }
   int sum = 0;
   while(!st.isEmpty()){
    sum+=st.pop();
   }
   return sum;
    }
}