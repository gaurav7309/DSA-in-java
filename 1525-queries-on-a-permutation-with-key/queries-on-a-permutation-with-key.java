class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        int [] ans = new int[n];
         int [] actual  = new int[n];
         ArrayList<Integer > temp = new ArrayList<>();
        for(int i = 0;i<m;i++){
           temp.add(i+1);
        }
        
        ArrayList<Integer>  g= new ArrayList<>();
        for(int ele: queries){
       
       for(int i = 0;i<temp.size();i++){

        if(ele==temp.get(i)){
            g.add(i);
           int memp =   temp.remove(i);
           Deque<Integer> dq =  new ArrayDeque<>();
           dq.addLast(memp);
           for(int i1 = 0;i1<temp.size();i1++){
              dq.addLast(temp.get(i1));
           }
           temp.clear();
           //again convert the deque to the arraylist'

           for(int ele1: dq){
            temp.add(ele1);
           }
        }
       }


for(int i = 0;i<g.size();i++){
ans[i] = g.get(i);
}
        }
        return ans;
        
    }
}