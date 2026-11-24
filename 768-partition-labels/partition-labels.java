class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partition = new ArrayList<>();
        int start = 0;
        int end = 0;
        // take the arrat whose size is the 26 
        int [] last_occurance = new int[26];
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            last_occurance[curr-'a'] = i;
        }
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            int lastIndex =  last_occurance[curr-'a'];
            end = Math.max(end,lastIndex);
            if(i==end){
                partition.add(end-start+1);
                start = i+1;
            }
        }
        return partition;
    }
}