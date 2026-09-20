class Solution {
    String rev(String s){
        StringBuilder t = new StringBuilder(s);
        int p = 0; int q = s.length()-1;
        while(p<q){
        char temp = t.charAt(p);
        t.setCharAt(p,t.charAt(q));
        t.setCharAt(q,temp);
        p++; q--;
        }
        return t.toString();
    }
    public String reverseWords(String s) {
     int n = s.length();
     String [] arr = s.split(" ");
     StringBuilder st = new StringBuilder();
     for(int i = 0;i<arr.length;i++){
     String temp = rev(arr[i]);
     st = st.append(temp);
     if(i!=arr.length-1){
     st = st.append(' ');   
     }
     }  
     return st.toString(); 
    }
}