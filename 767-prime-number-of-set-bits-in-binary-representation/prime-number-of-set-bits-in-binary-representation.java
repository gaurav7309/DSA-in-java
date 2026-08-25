class Solution {
    int bit(int n){
        int one =  0;
        while(n!=0){
            if(n%2==1){
                one++;
            }
           
            n/=2;
        }
        return one;
    }
    int prime(int n){
       int  p = 0;
       for(int i = 2;i<=Math.sqrt(n);i++){
        if(n%i==0){
        p++;
        }
       }
       if(p==0){
        return 1;
       }
       else{
        return 0;
       }
    }
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
    for(int i = left;i<=right;i++){
       int temp  = bit(i); 
       if(temp!=1){
       int memp = prime(temp);
       if(memp==1){
       c++;
       }
    }   
    } 
    return c;
    }
}