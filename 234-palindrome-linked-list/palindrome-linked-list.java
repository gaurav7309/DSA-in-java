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
    public boolean isPalindrome(ListNode head) {
       ListNode newlist = new ListNode(head.val);
        ListNode traverse_newlist = newlist;
        ListNode temp = head.next;

        while(temp != null){
            traverse_newlist.next = new ListNode(temp.val);
            traverse_newlist = traverse_newlist.next;
            temp = temp.next;
        }

    ListNode curr = head;
    ListNode prev = null;
    while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    while(newlist!=null){
    if(newlist.val!=prev.val){
     return false;
    }
    else{
        newlist = newlist.next;
        prev = prev.next;
    }
    }
    return true;
    }
}