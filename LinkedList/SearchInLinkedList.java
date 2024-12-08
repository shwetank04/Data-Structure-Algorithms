public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        Node m = head;
        while(m != null){
            if(m.data == k){
                return 1;
            }
            m = m.next;
        }
        return 0;
    }
}
