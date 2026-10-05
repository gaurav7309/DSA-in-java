class Solution {
    public int numSub(String s) {
    int n = s.length();
    long sum = 0;
    for(int i = 0;i<n;i++){
        if(s.charAt(i)=='1'){
            int c = 0;
            while(i<n){
              if(s.charAt(i)=='1'){
              c++;
              i++;
              } 
              else{
                break;
              }
            }
            while(c!=0){
                sum=(sum+c)%1000000007;

                c--;
            }
            i--;
        }
    }   
    return (int)sum; 
    }
}