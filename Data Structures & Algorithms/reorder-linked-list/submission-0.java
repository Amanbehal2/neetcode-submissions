class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle
        ListNode FastNode = head;
        ListNode slowNode = head;
        while (FastNode != null && FastNode.next != null && FastNode.next.next != null) {
            FastNode = FastNode.next.next;
            slowNode = slowNode.next;
        }

        // Step 2: Reverse second half
        ListNode second = reverseNode(slowNode.next);

        // Step 3: Split the list
        slowNode.next = null;

        // Step 4: Merge two halves
        ListNode first = head;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public ListNode reverseNode(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseNode(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
