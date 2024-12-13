public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        int length = 0;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                fast = fast.next;
                while(slow !=fast){
                    fast = fast.next;
                    length++;
                }
                return length + 1;
            }
        }
        return length;
    }
}
