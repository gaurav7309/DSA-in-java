class StockSpanner {
    public  class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
   static Stack<pair> st;
   

    public StockSpanner() {
           
        st = new Stack<>();
      
    }
    
    public int next(int price) {
        int span = 1;
        if(!st.isEmpty()){
        while(!st.isEmpty() && st.peek().first<=price){
            pair use = st.pop();
            span+=use.second;

        }
            
        }
        st.push(new pair(price,span));
        // again restore the ele of the remp stack teo the st staxk so that we can use this i9n the next time

        // while(!temp.isEmpty()){
        //     st.push(temp.pop());

        // }
        // st.push(price);


        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */