class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        int n = list1.length;
        int m = list2.length;

        ArrayList<String> arr = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (list1[i].equals(list2[j])) {

                    int sum = i + j;

                    if (sum < min) {
                        arr.clear();
                        arr.add(list1[i]);
                        min = sum;
                    }
                    else if (sum == min) {
                        arr.add(list1[i]);
                    }
                }
            }
        }

        String[] ans = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }
}