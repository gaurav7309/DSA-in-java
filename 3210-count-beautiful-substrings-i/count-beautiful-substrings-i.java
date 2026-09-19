class Solution {
    public int beautifulSubstrings(String s, int k) {
    int n = s.length();
    int count = 0;
    for(int i = 0;i<n;i++){
        int vowel = 0;
        int consonant  = 0;
        for(int j = i;j<n;j++){
            if(s.charAt(j)=='a'||s.charAt(j)== 'e' ||s.charAt(j)== 'i'||s.charAt(j)== 'o'||s.charAt(j)== 'u'){
            vowel++;
            }
            else{
                consonant++;
            }
            if(vowel==consonant){
            if((vowel*consonant)%k==0){
            count++;
            }
            }
        }
    }
    return count;    
    }
}