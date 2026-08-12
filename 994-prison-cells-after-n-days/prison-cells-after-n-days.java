class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {

        n = n % 14;

        if (n == 0) {
            n = 14;
        }

        for (int j = 0; j < n; j++) {

            int[] arr = new int[cells.length];

            for (int i = 1; i < cells.length - 1; i++) {

                if (cells[i - 1] == cells[i + 1]) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
            }

            cells = arr;
        }

        return cells;
    }
}