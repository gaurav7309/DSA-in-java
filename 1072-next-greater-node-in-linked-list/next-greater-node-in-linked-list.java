/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null){
            return new int[0];
        }
        ListNode temp = head;
      
        int n = 0;

        while(temp!=null){  // for counting the element int he list
           n++;
           temp = temp.next;
        }

        int[] check = new int[n];
        ListNode memp = head;
        int p = 0;
        while(memp!=null){
            check[p++] = memp.val;
            memp = memp.next;

        }

        
        int [] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n-1;i++){
           
            int memp1 = 0;
           
            for(int j = i+1;j<n;j++){
            if(check[i]<check[j]){
                memp1 = check[j];
                break;
            }
            }
            ans[i] = memp1;
        }
        return ans;
    }
}