public class Solution {
    public static Node deleteHead(Node head) {
        // Write Your Code Here.
        if(head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next; 
        head.prev = null;
        prev.next =null;
        return head;
    }
}
