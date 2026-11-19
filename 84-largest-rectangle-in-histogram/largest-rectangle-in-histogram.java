class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int [] pse = new int[n];
        int [] nse  =  new int[n];
        java.util.Arrays.fill(pse,-1);
        java.util.Arrays.fill(nse,n);
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        // calculate the previous smallest eele 

        for(int i  = n-1;i>=0;i--){
        while(!st1.isEmpty() && heights[i]<heights[st1.peek()]){
            pse[st1.pop()] = i;
            
        }
        st1.push(i);
        }

        // calculate the next smallest eele 

        for(int i  = 0;i<n;i++){
        while(!st2.isEmpty() && heights[i]<heights[st2.peek()]){
            nse[st2.pop()] = i;
            
        }
        st2.push(i);
        }
        // then check whether the which has the max area of the histogram
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int u   = -1;
            max = Math.max(max,heights[i]*(nse[i]-pse[i]-1));
        }
        return max;
    }
}