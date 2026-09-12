class Solution {
    public int minimumRecolors(String blocks, int k) {
    int n = blocks.length();
    int white = 0;
    int min = Integer.MAX_VALUE;
    StringBuilder ans = new StringBuilder();
    int i = 0;
    for(i = 0;i<k;i++){
    if(blocks.charAt(i)=='W'){
    white++;    
    }    
    ans = ans.append(blocks.charAt(i));
    }
    min = Math.min(min,white);

    for(int j = i;j<n;j++){
    if(blocks.charAt(j)=='W'){
    white++;
    }
    ans = ans.append(blocks.charAt(j));
    char t = ans.charAt(0);
    ans.deleteCharAt(0); 
    if(t=='W'){
      white--;  
    }
    min = Math.min(white,min);

    }
    return min;
    }
}