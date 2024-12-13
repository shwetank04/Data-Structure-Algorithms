public class Solution {
    public static Node oddEvenList(Node head) {
        // Write your code here.
        if(head == null && head.next == null){
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while(even!=null && even.next !=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
