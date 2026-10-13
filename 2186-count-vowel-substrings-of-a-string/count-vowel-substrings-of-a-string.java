class Solution {
    boolean checker(String s){
        int  n = s.length();
        int c = 0;
        HashMap<Character,Integer>mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                return false;
            }
        }
        return mp.size()==5;
    }
    public int countVowelSubstrings(String word) {
     int n = word.length();
     int c = 0;
     for(int i = 0;i<n;i++){
        String temp  = "";
        for(int j = i;j<n;j++){
        temp+=word.charAt(j);
        boolean temp1 = checker(temp);
        if(temp1){
        c++;
        }
        }
     }   
     return c;
    }
}