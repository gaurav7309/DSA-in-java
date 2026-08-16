class Solution {
    int Binary(int n){
        if(n==0){
            return 0;
    }
    int one = 0;
    while(n!=0){
        if(n%2==1){
            one++;
        }
        n/=2;

    }
     return one;
    }
    public int[] countBits(int n) {
     int [] arr = new int[n+1];
     for(int i = 0;i<=n;i++){
       arr[i] =  Binary(i);

     }   
     return arr;
    }
}