class Solution {
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a % b);
    }
    int gcdt(int []  arr){
        int n = arr.length;
       
        int realgcd =  arr[0];
        for(int i = 1;i<n;i++){
        realgcd = gcd(arr[i],realgcd);
        }
        return realgcd;
        }
    int lcm(int [] arr){
        int n = arr.length;
        int lcm = arr[0];
        for(int i = 1;i<n;i++){
            if(lcm!=0  && arr[i]!=0){
            lcm = (lcm*arr[i])/gcd(lcm,arr[i]);}
        }
        return lcm;
    }
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
    for(int i = 0;i<n;i++){
    int [] temp = new int [n];
    int p = 0;
    int pro = 1;
    for(int j = i;j<n;j++){
    temp[p++] = nums[j];
    pro*=nums[j];
    if(pro==gcdt(temp)*lcm(temp)){
    max = Math.max(max,p);    
    }

    }
    } 
    return max;
    }
}