public class Solution {
    public static Node deleteNode(Node head, int k) {
        // Write Your Code Here.
        if( head == null || head.next == null){
            return null;
        }
        if(k == 1){
           Node temp = head;
           head = head.next;
        if (head != null) {
            head.prev = null;
        }
        temp.next = null;
        return head;
        }
        int count = 1;
        Node temp = head;
        while( temp != null && count != k ) {
            count ++;
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        if(temp.next == null){
            Node prev = temp.prev;
            prev.next = null;
            temp.prev = null;
            return head;
        }
        Node prev = temp.prev;
        Node next = temp.next;
        prev.next = next;
        next.prev = prev;
        temp.prev = null;
        temp.next = null;
        return head;

    }
}
