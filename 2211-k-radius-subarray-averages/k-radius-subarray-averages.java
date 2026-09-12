class Solution {
    public int[] getAverages(int[] nums, int k) {
    int n = nums.length;
    int [] arr = new int[n];
    Arrays.fill(arr,-1);
    for(int i = 0;i<n;i++){
      long sum = 0;
       
        if((n-i-1)>=2*k){
        for(int j = i;j<=i+2*k && j<n;j++){ 
        sum+=nums[j];
        }
        sum  = sum/(2*k+1);
        arr[k+i] = (int)sum;
    }  
     }
    
    return arr;
    }
}
