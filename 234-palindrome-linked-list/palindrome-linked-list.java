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
    ListNode temp = head;
    ArrayList<Integer> arr = new ArrayList<>();
    int c = 0;
    while(temp!=null){
        arr.add(temp.val);
        temp = temp.next;
        c++;
    }  
    int i= 0 ; int q = c;
    while(i<c){
        if(!arr.get(i).equals(arr.get(c-i-1))){ return false;}
        i++; 
    }  
    return true;
    }
}