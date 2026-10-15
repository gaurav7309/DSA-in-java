class Solution {
    public int residuePrefixes(String s) {
        int n = s.length();
        HashSet<Character> st = new HashSet<>();
        int max = 0;
        for(int i = 0;i<n;i++){
            
        st.add(s.charAt(i));
        if(st.size()==(i+1)%3){
            max+=1;
        }    
        }
        
        return max;
    }
}