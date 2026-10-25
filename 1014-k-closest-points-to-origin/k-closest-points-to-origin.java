import java.util.*;
class Triplet implements Comparable<Triplet>{
    int diss;
    int x;
    int y;
    Triplet(int diss,int x,int y){
        this.diss = diss;
        this.x = x;
        this.y = y;

    }
  public int compareTo(Triplet t){
        return Integer.compare(this.diss,t.diss);
  }

}
class Solution {
    public int[][] kClosest(int[][] points, int k) {

var pq = new PriorityQueue<Triplet>(Collections.reverseOrder());
for(int [] point : points){
    int x1  = point[0];
    int y1 = point[1];
    int diff1 = x1*x1+y1*y1;
    pq.add(new Triplet(diff1,x1,y1));
    if(pq.size()>k){
        pq.remove();
    }
}
int [][] ans = new int[k][2];
int p = 0;
while(pq.size()!=0){
    Triplet temp = pq.remove();
    ans[p][0] = temp.x;
    ans[p++][1] = temp.y;
}
return ans;
    }
}
