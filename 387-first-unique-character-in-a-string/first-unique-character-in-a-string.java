class Solution {
    public int firstUniqChar(String s) {
       int n =  s.length();
       int [] arr = new int [26];
       for(int i = 0;i<n;i++){
       arr[s.charAt(i)-'a']++;
       } 
       // chack we=eather the gives the element has the count 
       for(int i = 0;i<n;i++){
       if(arr[s.charAt(i)-'a']==1){
        return i;
       }
       }
       return -1;
    }
}