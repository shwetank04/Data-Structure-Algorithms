public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = head;
        while(fast !=null && fast.next!=null && fast.next.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next != null){
            slow.next = slow.next.next;
            return head;
        }
         prev.next = prev.next.next;
         return head;
    }
}
