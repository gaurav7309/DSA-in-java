class Solution {
    public String removeOccurrences(String s, String part) {
     int n = s.length();
     int m = part.length();
        StringBuilder ans = new StringBuilder(s);
      for(int i = 0;i<=ans.length()-m;i++){
        String temp = "";
        boolean flag = true;
        for(int j = 0;j<m;j++){
        temp = temp+ans.charAt(i+j);
        }
        if(temp.equals(part)){
            ans.delete(i,i+m);
            i = -1;
        }
        
      }  
      return ans.toString();
    }
}