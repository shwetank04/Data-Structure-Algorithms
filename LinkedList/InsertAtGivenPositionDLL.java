class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        if(head == null){
            return null;
        }
        Node n = new Node(x);
        int count = 1;
        Node temp = head;
        while(count != p+1) {
            count ++;
            temp = temp.next;
        }
        if(temp.next == null){
            temp.next = n;
            n.prev = temp;
            return head;
        }
        else{
            n.next = temp.next;
            temp.next.prev = n;
            temp.next = n;
            n.prev = temp;
            return head;
        }
    }
}
