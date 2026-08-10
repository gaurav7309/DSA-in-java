class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = new int[2];

        ListNode temp = head;

        ArrayList<Integer> arr = new ArrayList<>();

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> temp1 = new ArrayList<>();
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                temp1.add(i + 1);
            }
            else if (arr.get(i) < arr.get(i - 1) && arr.get(i) < arr.get(i + 1)) {
                temp1.add(i + 1);
            }
        }
        // Less than 2 critical points
        if (temp1.size() < 2) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        int minima = Integer.MAX_VALUE;
        int maxima = Integer.MIN_VALUE;

        // Maximum distance
        maxima = temp1.get(temp1.size() - 1) - temp1.get(0);

        // Minimum distance
        for (int i = 1; i < temp1.size(); i++) {

            int distance = temp1.get(i) - temp1.get(i - 1);

            minima = Math.min(minima, distance);
        }

        ans[0] = minima;
        ans[1] = maxima;

        return ans;
    }
}