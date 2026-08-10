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
    public ListNode removeElements(ListNode head, int val) {
     if(head==null){
        return null;
     }   
     ListNode temp = head;
     ArrayList<Integer> arr = new ArrayList<>();
     while(temp!= null ){
        arr.add(temp.val);
        temp = temp.next;
     }
     ListNode dummy = new ListNode(0);
     ListNode ans = dummy;
     for(int i = 0;i<arr.size();i++){
     if(!arr.get(i).equals(val)){
     ans.next = new ListNode(arr.get(i));
     ans = ans.next;
     }
     else{
        continue;
     }
     }
     return dummy.next;
    }
}