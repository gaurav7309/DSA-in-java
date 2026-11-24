class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        // secind way for the lsolbing this problem wwe hage to take teh mapn the store the currnt character
        int n =  s.length();
        var mp = new HashMap<Character,Integer>();
        for(int i = 0;i<n;i++){
        mp.put(s.charAt(i),i);
        }
        int start = 0;
        int end = 0;
        for(int i =0 ;i<n;i++){
        int len = mp.get(s.charAt(i));
        end = Math.max(len,end);
    if(i==end){
    
    ans.add(end-start+1);
    start = end+1;
        }}
        return ans;
            }
}