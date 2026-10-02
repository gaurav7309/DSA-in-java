class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int c = 0;
    for(int i = 0;i<n;i++){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int j = i;j<n;j++){
            arr.add(nums[j]);
            if(arr.size()>=3){
            // check for the diff are the same or not 
            int temp = arr.get(arr.size()-1)-arr.get(arr.size()-2);
            boolean temp1 = true;
            for(int k = arr.size()-1;k>0;k--){
              if((arr.get(k)-arr.get(k-1))!=temp){
              temp1 = false;
              break;
              }  
            }
            if(temp1){
            c++;
            }   
            }
        }
    }
    return c;    
    }
}