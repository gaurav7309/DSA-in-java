class MinStack {
   static Stack<Integer> st;
    static Stack<Integer> min;
//   static int min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        // min = Math.min(min,value);
          if(min.isEmpty()){
            min.push(value);
        }
      else  if(!min.isEmpty() && min.peek()>=value){
            min.push(value);
        }
      
    }
    
    public void pop() {
     int check =  st.pop();
     if(min.contains(check) && min.peek()==check){
        min.remove(Integer.valueOf(check));
     }  
    }
    
    public int top() {
       return st.peek(); 
    }
    
    public int getMin() {
        // find out the min ele to the stack 
        // int  min = Integer.MAX_VALUE;
        // int i = 0;
        // while(!st.isEmpty() && i<st.size()){
        //     min  = Math.min(min, st.get(i));
        //     i++;
        // }

        // st.remove(Integer.valueOf(min));
        if(!min.isEmpty()){
        return min.peek();}
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */