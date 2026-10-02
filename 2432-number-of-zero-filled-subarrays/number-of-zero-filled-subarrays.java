class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
    int c = 0;
    long sum = 0;
    for(int i = 0;i<n;){
    if(nums[i]==0){
        while(i<n){
        if(nums[i]==0){
        c++;   
        }
        else{
            while(c!=0){
            sum+=c;
            c--;
            }
            break;
        }    
        i++;
        }} 
       
    
    else{
        i++;
        continue;
    }
    // for the last c;
       while(c!=0){
            sum+=c;
            c--;
            }
    }
    return sum;    
    }
}