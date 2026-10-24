class Solution {
    public int countOfSubstrings(String word, int k) {
      int n = word.length();
      int ans = 0;
      for(int i = 0;i<n;i++){
    
        int con = 0;
        HashSet<Character> st = new HashSet<>();
        for(int j = i;j<n;j++){
        if(word.charAt(j)=='a' || word.charAt(j)=='e' ||word.charAt(j)=='i' ||word.charAt(j)=='o' ||word.charAt(j)=='u' ){
        st.add(word.charAt(j));
        }
        else{
            con++;
        }
        if(st.size()>=5 && con==k){
            ans++;
        }
        } 
      }  
      return ans;
    }
}