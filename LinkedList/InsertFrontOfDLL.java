public class Solution {
    public static Node insertAtFront(Node head, int k) {
        // Write Your Code Here.
        if(head == null){
            return new Node(k);
        }
        Node head1 = new Node(k);
        head.prev = head1;
        head1.next = head;
        head1.prev = null;
        return head1;
    }
}
