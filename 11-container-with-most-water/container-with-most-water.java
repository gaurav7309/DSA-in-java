class Solution {
    public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    int n = height.length;
    int area = 0;
    int min = 0;
    int p = n-1;
    int i = 0;
    while(i<p){
    min = Math.min(height[i],height[p]);
    area = min * (p-i);
    max = Math.max(area,max);
    if(height[i]<height[p]){
        i++;
    }
    else{
     p--;  
    }   
     

    }  
    return max;  
    }
}