class Solution {
    public int tribonacci(int n) {
        //using the tabulation then the solution of the question
    int x = 0;
    if(n==0){
        return 0;
    }
    else if(n==1){
        return 1;
    }
    else if(n==2){
        return 1;
    }
    int y = 1;
    int z = 1;
    int sum  = 0;
    for(int i = 3;i<=n;i++){
    sum=x+y+z;
    
    
    x = y;
    y = z;
    z = sum;

    }
    return sum;
    }
}