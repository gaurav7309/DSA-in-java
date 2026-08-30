class Solution {
   String bit(int n){
   StringBuilder st = new StringBuilder();
    while(n!=0){
    st.append(n%2);
    n/=2;
    }
    return st.toString();
    }
    public boolean hasTrailingZeros(int[] nums) {
     int n = nums.length;
     for(int i = 0;i<n-1;i++){
         for(int j = i+1;j<n;j++){
            int temp = nums[i]|nums[j];
           String memp = bit(temp);
           if(memp.charAt(0)=='0'){
            return true;
           }
         }
     }  
     return false; 
    }
}