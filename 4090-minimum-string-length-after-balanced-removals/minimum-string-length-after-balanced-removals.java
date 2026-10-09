class Solution {
    public int minLengthAfterRemovals(String s) {
     int n = s.length();
     int a = 0;
     int b = 0;
     for(int i =  0;i<n;i++){
     if(s.charAt(i)=='a'){
        a++;
     }
     else{
        b++;
     }
     }   
     int min = Math.min(a,b);
      return s.length()-min*2;
    }
}