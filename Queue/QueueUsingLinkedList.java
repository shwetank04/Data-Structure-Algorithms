
class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode node = new QueueNode(a);
        if(front == null && rear ==null) {
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        if (front == null) {
            return -1;
        }
        
        int result = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        return result;
        }
}
