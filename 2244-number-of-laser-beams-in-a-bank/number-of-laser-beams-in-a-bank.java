class Solution {
    public int numberOfBeams(String[] bank) {
    int n   = bank.length;
    int c = 0;
    for(int i = 0;i<n-1;i++){
        String temp = bank[i];
         for(int j = 0;j<temp.length();j++){
           if(temp.charAt(j)=='1'){
          
             for(int k = i+1;k<n;k++){
               String memp = bank[k];
                int ch = 0; 
                for(int l = 0;l<memp.length();l++){
                   if(memp.charAt(l)=='1'){
                    c++;
                    ch++;
                     
                   } 
                  
                }
                if(ch!=0){
                    break;
                }
                }

        }
        }
    }    
    
    return c;
    }
}