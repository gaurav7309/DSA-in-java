class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int [] ans = new int [n];
        int p = 0;
        for(int [] query:queries){
            int x_axis = query[0];
            int y_axis = query[1];
            int redius = query[2];
            int pos_x_round = x_axis+redius;
            int y_round = y_axis+redius;
            int neg_x_round = x_axis-redius;
            int temp = 0;
               for(int [] point : points){
                int x = point[0];
                int y = point[1];

                if((x-x_axis)*(x-x_axis)+(y-y_axis)*(y-y_axis)<=redius*redius){
                temp++;
                }
            }
            ans[p++]= temp;
        }
        return ans;
    }
}