class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs,(a,b) -> a[1]-b[1]); // sort the 2D array so that they are the become the stricktly increasing order

       
           
        int [][] sortedQueries = new int [queries.length][2];

        for(int i = 0;i<queries.length;i++){
            sortedQueries[i] =  new int[]{queries[i],i};

        }

        Arrays.sort(sortedQueries,(a,b) -> a[0]-b[0]); // buinding the array to the its index


        int n1 = queries.length;

        int [] ans = new int[n1];
        int start = 0;
        int end = 0;
        
         var freMap = new HashMap<Integer,Integer>();
        for(int i = 0;i<n1;i++){
            int min = sortedQueries[i][0]-x;
            int max  =  sortedQueries[i][0];
            int index = sortedQueries[i][1];
            while(end<logs.length && logs[end][1]<=max){
                freMap.put(logs[end][0],freMap.getOrDefault(logs[end][0],0)+1);
                end+=1;
            }

            while(start<end && logs[start][1]<min){
                freMap.put(logs[start][0],freMap.get(logs[start][0])-1);
                if(freMap.get(logs[start][0])==0){
                    freMap.remove(logs[start][0]);
                }
                start+=1; 
            }
            ans[index] = n-freMap.size();

        }
       return ans;
    }
}