
class Solution {
    public class pair {
        int first;
        int second;
        double per;

        pair(int first, int second, double per) {
            this.first = first;
            this.second = second;
            this.per = per;
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
            double diff1 = (double)(a.second - a.first) /
                           (a.second * (a.second + 1.0));
            double diff2 = (double)(b.second - b.first) /
                           (b.second * (b.second + 1.0));

            return Double.compare(diff2, diff1);
        });

        for (int[] class1 : classes) {
            int pass = class1[0];
            int tot = class1[1];

            pq.add(new pair(pass, tot, (double) pass / tot));
        }

        while (extraStudents-- > 0) {
            pair temp = pq.remove();

            int pass = temp.first + 1;
            int tot = temp.second + 1;

            pq.add(new pair(pass, tot, (double) pass / tot));
        }

        double ans = 0;

        while (pq.size() != 0) {
            pair temp = pq.remove();
            ans += temp.per;
        }

        return ans / classes.length;
    }
}
