public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while(fast != null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                loop = true;
                slow = head;
                break;
            }
        }
        if(loop){
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
