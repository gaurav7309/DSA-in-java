class Solution {
    public int[] constructRectangle(int area) {
        int [] arr = new int[2];
        int W = (int)Math.sqrt(area);
        while(area%W!=0){
            W--;
        }
        int L = area/W;
      
            arr[0] = L;
            arr[1] = W;
        
        return arr;
    }
}