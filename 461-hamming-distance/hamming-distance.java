class Solution {
    String bit(int n){
    String ans = "";
    while(n!=0){
    int ans1 = (n%2);
    String temp = Integer.toString(ans1);
    ans = ans+temp;
    n/=2;
    }
    return rev(ans);
    }
    String rev(String ans){
    StringBuilder str = new StringBuilder(ans); 
     int p  = 0;
     int q = str.length()-1;
     while(p<q){
     char temp  = str.charAt(p);
     str.setCharAt(p,str.charAt(q));
     str.setCharAt(q, temp);
     p++;     q--;
     }  
     return str.toString(); 
    }
    public int hammingDistance(int x, int y) {
   String bit1 = bit(x);
   String  bit2 = bit(y); 
   int len = Math.max(bit1.length(),bit2.length());
    while(bit1.length()<len){
    bit1 = "0"+bit1;
    }
    while(bit2.length()<len){
    bit2 = "0"+bit2;
    }
    int p =  0; int c = 0;
    while(p<len){
        if(bit1.charAt(p)!=bit2.charAt(p)){
            c++;
        }
        p++;
    }
    return c;
    }
}