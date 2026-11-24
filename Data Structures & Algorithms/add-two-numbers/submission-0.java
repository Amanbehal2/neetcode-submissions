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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=null;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            if(sum>9){
                int num=sum%10;
                sum=sum-num;
                carry=sum/10;
                sum=num;
            }
            else{
                carry=0;
            }
            if(head==null){
                head=new ListNode(sum);
            }
            else{
                ListNode iter=head;
                while(iter.next!=null){
                    iter=iter.next;
                }
                iter.next=new ListNode(sum);
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=carry+l1.val;
            if(sum>9){
                int num=sum%10;
                sum=sum-num;
                carry=sum/10;
                sum=num;
            }
            else{
                carry=0;
            }
            if(head==null){
                head=new ListNode(sum);
            }
            else{
                ListNode iter=head;
                while(iter.next!=null){
                    iter=iter.next;
                }
                iter.next=new ListNode(sum);
            }
            l1=l1.next;
        }
        while(l2!=null){
            int sum=carry+l2.val;
            if(sum>9){
                int num=sum%10;
                sum=sum-num;
                carry=sum/10;
                sum=num;
            }
            else{
                carry=0;
            }
            if(head==null){
                head=new ListNode(sum);
            }
            else{
                ListNode iter=head;
                while(iter.next!=null){
                    iter=iter.next;
                }
                iter.next=new ListNode(sum);
            }
            l2=l2.next;
        }
        if(carry>0){
            ListNode iter=head;
            while(iter.next!=null){
                iter=iter.next;
            }
            iter.next=new ListNode(carry);
        }
    
        return head;
    }
}
