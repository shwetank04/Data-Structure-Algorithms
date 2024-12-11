public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(curr !=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;;
        }
        return prev;
    }
}
