class Solution {
    static int [] dp;
    public static int check(int num1,int num2,int i){
        if(i>num2){
            return 0;
        }

        int num = i;
        int c = 0;

        while(num>=100){
            int temp = num%10;
            
            int  memp = (num/10)%10;
           
             int  chemp = (num/100)%10;

             if(memp<temp && memp<chemp){
                 c++;
             }
             else if(memp>temp && memp>chemp){
                c++;
             }
              num/=10;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int valley = check(num1,num2,i+1);
        
        return dp[i] = c+valley;
    }
    public int totalWaviness(int num1, int num2) {
       dp = new int [num2+1];
       
        java.util.Arrays.fill(dp,-1);

       return check(num1,num2,num1);

    }
}