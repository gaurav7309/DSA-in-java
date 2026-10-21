class Solution {
    public int divisorSubstrings(int num, int k) {
     String s =  Integer.toString(num);
     StringBuilder st = new StringBuilder(s);
     int n = s.length();
     int ans = 0;
     StringBuilder temp = new StringBuilder();
     
     for(int i = 0;i<k;i++){
     temp.append(st.charAt(i));
     }   
     int num1 = Integer.parseInt(temp.toString());
     if(num1!=0 && num%num1==0){
        ans++;
     }

    
     for(int i = k;i<n;i++){
  
     temp.deleteCharAt(0);
     
     temp.append(st.charAt(i));
    int num2 = Integer.parseInt(temp.toString());
    if(num2!=0 && num%num2==0 ){
        ans++;
    }
    

     }
     return ans;
    }
}