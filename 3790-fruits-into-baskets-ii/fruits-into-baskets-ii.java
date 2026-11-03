class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        // convert the basket array to the array list 
        ArrayList<Integer> ans =  new ArrayList<>();
        for(int i = 0;i<n;i++){
        ans.add(baskets[i]);
        }
        int [] visited =  new int[101];
       
        for(int i = 0;i<n;i++){
        for(int j = 0;j<ans.size();j++){
            if(fruits[i]<=ans.get(j)){
             if(visited[j]!=1){
               visited[j] = 1;
               break;
             }

            }
        }
        }
         int re = 0;
        for(int i = 0;i<=100;i++){
            if(visited[i]==1){
                re++;
            }
        }

        return baskets.length-re;
    }
}