class Solution {
    boolean check(String s){
    // creation of the hashmap
    HashMap<Character,Integer> mp = new HashMap<>();
    int n = s.length();
    for(int i = 0;i<n;i++){
    mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
    }
    // checking of  the character
    for(int i  = 0;i<n;i++){
    char x = s.charAt(i);
    char y = Character.toUpperCase(x);
    char z = Character.toLowerCase(x);
    if(!mp.containsKey(y)|| !mp.containsKey(z)){
        return false;
    }
    }
    return true;
    }
    public String longestNiceSubstring(String s) {
      int n = s.length();
      int max = Integer.MIN_VALUE;
      String ans = "";
      for(int i = 0;i<n;i++){
        String temp = "";
        for(int j = i;j<n;j++){
        temp+=s.charAt(j);
        if(check(temp)){
           if(max<j-i+1){
            max  = j-i+1;
            ans = temp;
        }
        }
      }}  
      return ans;
    }
}