class Solution {
    public static int histogram(int [] height){
        int n  = height.length;
        // for the fins out the nse and the pse
        int [] pse = new int [n];
        int [] nse = new int [n];
        java.util.Arrays.fill(pse,-1);
        java.util.Arrays.fill(nse,n);

        // for finding the pse;
        Stack<Integer> st1 = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!st1.isEmpty() && height[i]<height[st1.peek()]){
            pse[st1.pop()] = i;
            }
            st1.push(i);
        }

        
        // for finding the nse;
        Stack<Integer> st2 = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!st2.isEmpty() && height[i]<height[st2.peek()]){
            nse[st2.pop()] = i;
            }
            st2.push(i);
        }

        // find out the max area of the histogram
        int max_area = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
        // int use = -1;

        max_area = Math.max(max_area,height[i]*(nse[i]-pse[i]-1));
        }
        return max_area;
    
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [] height = new int[m];
        int max =  Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int use = -1;
            for(int j = 0;j<m;j++){
                if(matrix[i][j] =='1'){
                    height[j]+=1;
                }
                else{
                    height[j] = 0;
                }
            }
            use = histogram(height);
            max = Math.max(use,max);
        }
        return max;
    }
}