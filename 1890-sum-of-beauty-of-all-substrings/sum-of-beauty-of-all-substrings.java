class Solution {
    public int beautySum(String s) {
    int n = s.length();
    int sum = 0;
    for(int i = 0;i<n;i++){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j = i;j<n;j++) {
        if(map.containsKey(s.charAt(j))){
            int x = map.get(s.charAt(j));
            map.put(s.charAt(j),x+1);
        } 
        else{
         map.put(s.charAt(j),1);
        }   
        // for finding the max and the min value of the 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int k : map.values()){
        if(max<k){
            max = k;
        }
        if(min>k){
            min = k;
        }
        }
       sum+=max-min;
        }
    }    
    return sum;
    }
}