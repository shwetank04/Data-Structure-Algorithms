public class Solution {
    public static int length(Node head){
        //Your code goes here
        int length = 1;
        Node m = head;
        while(m.next != null){
            length++;
            m = m.next;
        }
        return length;
    }
}
