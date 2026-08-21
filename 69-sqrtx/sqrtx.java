class Solution {
    public int mySqrt(int x) {
     for(int i = 0;i<=x;i++){
        if((long)i*i==x){
            return i;
        }
        else if((long)i*i<x && (long)(i+1)*(i+1)>x){
         return i;
        }
        else{
            continue;
        }
     }
    return -1;
    }
}