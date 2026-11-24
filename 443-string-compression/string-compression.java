class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int start = 0;
        while(i<n){
            int j = i;
            while(j<n && chars[i]==chars[j]){
               
                    j+=1;
                
            }
               chars[start] = chars[i];
               start+=1;
               int count = j-i;
               if(count>1){
                for(char ch: String.valueOf(count).toCharArray()){
                    chars[start] = ch;
                    start+=1;
                
               }
               }
               i = j;
            }
            
            return start ;
        
    }
}