class Solution {
    public String findDifferentBinaryString(String[] nums) {
       int n = nums.length;
       int p = 0;
       String ans = "";
       for(int i = 0;i<n;i++){
        String temp = nums[i];
        char memp = temp.charAt(p);
        if(memp=='0'){
         ans+='1';
        }
        else{
            ans+='0';
        }
       

        p++;
       } 
       return ans;
    }
}