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
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode ans = before;
         ListNode a = after;
         
        while(head!=null){
            if(head.val<x){
                before.next = head;
                before = before.next;
                head = head.next;
            }
            else{
                after.next = head;
                after = after.next;
                head = head.next;

            }
        }
        after.next = null;

       
        
      
        
        
       before.next = a.next;

      
    
        return ans.next;
    }
}