class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();
       
        int j = 0;
        int  p = 0;
        for(int i = 0;i<m;i++){
        boolean flag = true;
        while(j<n){
        if(s.charAt(j)==t.charAt(i)){
            j++;
           break ;
        }
        j++;
        
        }
        if(i==m){
            return 0;
        }
        if(j==n && s.charAt(j-1)!=t.charAt(i)){
           p = i;
            break;
        }  
        p = i+1;
        }
        return t.length()-p;  
        }
     
    
}