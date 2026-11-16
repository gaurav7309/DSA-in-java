class Solution {
    public String digitSum(String s, int k) {
        int n = s.length();
        while(s.length()>k){
        String memp = "";

        for(int i  = 0;i< s.length();){
          
            int temp =0;
            for(int j = i;j<s.length() && j<i+k;j++){
            temp+=s.charAt(j)-'0';
            
            }
            i=i+k;
            memp+=Integer.toString(temp);
            }
            s = memp;
        }
        
    
    
     
    return s;
    }
}