class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
       int n = answerKey.length();
       int left_check   = 0;
       var freq_map = new HashMap<Character,Integer>();

        int max_freq = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
       for(int check  = 0;check<n;check++){
       freq_map.put(answerKey.charAt(check),freq_map.getOrDefault(answerKey.charAt(check),0)+1);
       max_freq = Math.max(max_freq,freq_map.get(answerKey.charAt(check)));
       if((check-left_check+1)-max_freq>k){
        char del_left = answerKey.charAt(left_check);
        freq_map.put(del_left,freq_map.get(del_left)-1);
        
        left_check++;
       }
        result = Math.max(result,check-left_check+1);
       } 
       return result;
    }
}