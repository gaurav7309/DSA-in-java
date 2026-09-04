class Solution {
    public int[] canSeePersonsCount(int[] heights) {
    int n  = heights.length;
    int [] arr = new int [n];
    Stack<Integer> st = new Stack<>();
      if (n == 1) {
         return arr;
        }
    st.push(heights[n - 1]);
    for(int i = n-2;i>=0;i--){
    int temp = 0;
        while(!st.isEmpty() && heights[i]>st.peek()){
            temp++;
            st.pop();
        }
        if(!st.isEmpty()){
            temp++;
        }
        arr[i] = temp;
        st.push(heights[i]);
    }
    return arr; 
    }
}