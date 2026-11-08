class Solution {
    public String sortVowels(String s) {
       int n = s.length();
       char [] temp = new char[n];
       ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> con = new ArrayList<>();
       for(int i = 0;i<n;i++){
       if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'|| s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
        vowel.add(s.charAt(i));
       }
       else{
       con.add(s.charAt(i));
       }
       } 
       Collections.sort(vowel);
       int p = 0; int q = 0; 
        for(int i = 0;i<n;i++){
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'|| s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
           temp[i] = vowel.get(p++);
       }
       else{
          temp[i] = con.get(q++);
       }
        }
        return new String(temp);
    }
}