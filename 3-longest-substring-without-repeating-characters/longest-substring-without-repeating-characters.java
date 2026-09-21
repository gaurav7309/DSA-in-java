class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    HashSet<Character> st = new HashSet<>();
    int max = 0;
     String temp = "";
     if(n==1){
        return 1;
     }
    for(int i = 0;i<n;i++){

    if(!st.contains(s.charAt(i))){
    st.add(s.charAt(i));
    temp = temp+s.charAt(i);
    }
    else{
    max = Math.max(max,temp.length());

   int j = 0;
   while(temp.charAt(j)!=s.charAt(i)){
    st.remove(temp.charAt(j));
    j++;
    }
    st.remove(temp.charAt(j)); 
    temp = temp.substring(j+1);
    temp = temp+s.charAt(i);
    st.add(s.charAt(i));
    }
    }
    max = Math.max(max,temp.length());
    return max;  
    }
}