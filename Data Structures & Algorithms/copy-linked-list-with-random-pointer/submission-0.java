/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hs= new HashMap<Node,Node>();
        Node iterHead=head;
        while(iterHead!=null){
            Node node=new Node(iterHead.val);
            hs.put(iterHead,node);
            iterHead=iterHead.next;
        }
        Node newHead=null;
        while(head!=null){
            Node n=hs.get(head);
            if(head.next!=null){
                n.next=hs.get(head.next);
            }
            if(head.random!=null){
                n.random=hs.get(head.random);
            }
            if(newHead==null){
                newHead=n;
            }
            head=head.next;
        }
        return newHead;
    }
}
