import java.util.*;

class Solution {
    int[] swap(int[] nums) {
        int p = 0; 
        int q = nums.length - 1;
        while (p < q) {
            int t = nums[p];
            nums[p] = nums[q];
            nums[q] = t;
            p++; 
            q--;
        } 
        return nums;
    } 

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Convert list into array
        int[] nums = new int[n];
        temp = head;
        for (int i = 0; i < n; i++) {
            nums[i] = temp.val;
            temp = temp.next;
        }

        int p = 1;
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;

        while (i < n) {
            int actualGroupSize = Math.min(p, n - i);

            if (actualGroupSize % 2 != 0) {
                for (int j = 0; j < actualGroupSize; j++) {
                    result.add(nums[i]);
                    i++;
                } 
            } else {
                int[] even = new int[actualGroupSize];
                for (int j = 0; j < actualGroupSize; j++) {
                    even[j] = nums[i];
                    i++;
                }
                swap(even);
                for (int k = 0; k < even.length; k++) {
                    result.add(even[k]);  
                }
            }
            p++;
        }  

        // Convert ArrayList back to LinkedList
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        for (int val : result) {
            ans.next = new ListNode(val);
            ans = ans.next;
        }

        return dummy.next;
    }
}