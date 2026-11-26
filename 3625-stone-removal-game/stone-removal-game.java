class Solution {
    public boolean canAliceWin(int n) {
       
        int gaurav = 10;
        
        int k = 0;
       
        
        while(n>=gaurav){
             n = n-gaurav;
              gaurav--;
              k++;
        }
        return k%2==1 ? true:false;
    }
}