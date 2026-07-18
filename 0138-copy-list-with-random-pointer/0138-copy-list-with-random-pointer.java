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
        if(head==null){
            return head;
        }
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=new Node(curr.val);
            curr.next.next=temp;
            curr=temp;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        Node org=head;
        Node sec=head.next;
        Node temp=sec;
        while(org!=null){
            org.next=org.next.next;
            if(sec.next!=null){
                sec.next=sec.next.next;
            }
            org=org.next;
            sec=sec.next;
        }
        
   return temp;
    }
}