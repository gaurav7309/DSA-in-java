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
    int gcd(int a, int b){
    int max = Math.max(a,b);
    int min = Math.min(a,b);
    if(max%min==0){
        return min;
    }
    return gcd(min,max%min);

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
    if(head.next==null){
        return head;
    }
     ListNode dummy  = new ListNode(0);
     ListNode temp = dummy;
     ListNode memp = head;
    while(memp.next!= null){
    int a = memp.val;
    temp.next  = memp;
    temp = temp.next;
    memp = memp.next;
    int b  = memp.val;
    temp.next = new ListNode(gcd(a,b));
    temp = temp.next;
    temp.next = memp;
  
    }  
    return dummy.next;
    }
}