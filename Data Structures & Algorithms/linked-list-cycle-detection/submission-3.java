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
    public boolean hasCycle(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(slowPointer!=null && fastPointer!=null){
            slowPointer=slowPointer.next;
            if(fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            }
            else{
                return false;
            }
            if(slowPointer==fastPointer){
                return true;
            }
        }
        return false;
    }
}
