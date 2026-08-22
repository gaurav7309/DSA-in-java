class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int pro = 1;
        while(temp!=0){
       int t = temp%10;
       sum+=t;
       pro*=t;
        temp/=10;
        }
        int ans = sum+pro;
        if(n%ans==0){
            return true;
        }
        else{
            return false;
        }
    }
}