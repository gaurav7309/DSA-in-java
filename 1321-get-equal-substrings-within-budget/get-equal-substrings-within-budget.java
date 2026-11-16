class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n  = s.length();
        int start = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int end = 0;end<n;end++){
        sum+=Math.abs((s.charAt(end))-(t.charAt(end))) ;

        if(sum>maxCost && start<n){
            sum-=Math.abs((s.charAt(start))-(t.charAt(start)));
            start++;
        }
        max = Math.max(max,end-start+1);

        }
        return max;
    }
}