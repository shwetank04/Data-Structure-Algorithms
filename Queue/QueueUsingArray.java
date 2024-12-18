
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front= 0;
		rear= 0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    arr[rear] = x;
	    rear = (rear + 1) % arr.length;
	 
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(front == rear){
	        return -1;
	    }
		int poppedValue =  arr[front];
		front = (front + 1) % arr.length;
		return poppedValue;
	}
}