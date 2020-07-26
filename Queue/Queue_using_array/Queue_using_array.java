class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	/* The method push to push element
	   into the queue */
	void push(int x)
	{
	    if(rear == 100005){
	        return;
	    }
	    else{
	        arr[rear] = x;
	        rear++;
	    }
	    return;
	} 

    /* The method pop which return the 
       element poped out of the queue*/
	int pop()
	{
	    if(front==rear){
		    front=0;
		    rear=0;
		    return -1;
		}
		return arr[front++];
	} 
}