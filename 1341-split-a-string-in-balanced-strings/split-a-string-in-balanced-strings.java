class Solution {
    public int balancedStringSplit(String s) {
    int n = s.length();
    int c = 0;
    int l = 0; int r = 0;
    for(int i = 0;i<n;i++){
    if(s.charAt(i)=='R'){
        r++;
    }
    else if(s.charAt(i)=='L'){
        l++;
    }
    if(l==r){
    c++;
    l = 0; r = 0;
    }
    
    }
    return c;    
    }
}