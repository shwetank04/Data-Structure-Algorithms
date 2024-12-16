class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode n = new StackNode(a);
        n.next = top;
        top = n;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top != null){
         StackNode topData = top;
         top = top.next;
         topData.next = null;
         return topData.data;
        }
        return -1;
    }
}
