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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead=null;
        ListNode iterator=null;
        while(list1 != null && list2 != null){
            if(list1.val>list2.val){
                if(iterator==null){
                    iterator=new ListNode(list2.val);
                    newHead=iterator;
                }
                else{
                    iterator.next=new ListNode(list2.val);
                    iterator=iterator.next;
                }
                list2=list2.next;
            }
            else{
                if(iterator==null){
                    iterator=new ListNode(list1.val);
                    newHead=iterator;
                }
                else{
                    iterator.next=new ListNode(list1.val);
                    iterator=iterator.next;
                }
                list1=list1.next;
            }
        }
        while(list1!=null){
             if(iterator==null){
                    iterator=new ListNode(list1.val);
                    newHead=iterator;
                }
                else{
                    iterator.next=new ListNode(list1.val);
                    iterator=iterator.next;
                }
                list1=list1.next;

        }
        while(list2!=null){
            if(iterator==null){
                    iterator=new ListNode(list2.val);
                    newHead=iterator;
                }
                else{
                    iterator.next=new ListNode(list2.val);
                    iterator=iterator.next;
                }
                list2=list2.next;
        }
        return newHead;
    }
}