class Solution {
    public int maxVowels(String s, int k) {
    int n = s.length();
    int vowel = 0;
    int max = Integer.MIN_VALUE;
    int  i = 0;
    StringBuilder ans = new StringBuilder();
    for( i = 0;i<k;i++){
    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        vowel++;
    }
    ans = ans.append(s.charAt(i));
    }
    max = Math.max(max,vowel);
   
    for(int j = i;j<n;j++){
      if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
      vowel++;
    } 
    ans = ans.append(s.charAt(j));
    char ness =  ans.charAt(0);
    ans.deleteCharAt(0);
    if(ness=='a'||ness=='e'||ness=='i'||ness=='o'||ness=='u'){
        vowel--;
    }
    max = Math.max(max,vowel);

    } 
    return max;  
    }
}