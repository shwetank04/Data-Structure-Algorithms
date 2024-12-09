public class Solution
{
    public static Node insertAtTail(Node list, int K) {
        // Write your code here
        if(list == null){
            return new Node(K);
        }
        Node end = new Node(K);
        Node temp = list;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = end;
        end.prev = temp;
        end.next = null;
        return list;
    }
}
