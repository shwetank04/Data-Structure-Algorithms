public class Solution
{
    public static Node deleteLastNode(Node head) {
        // Write your code here
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next !=null){
            temp = temp.next;
        }
        Node last = temp.next;
        last.prev = null;
        temp.next = null;
        return head;
    }
}
