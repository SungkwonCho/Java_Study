public class Queue {
	
	private Object[] list;
	private int rear;         // Queue's entrance
	private int front;        // Queue's exit
	private int maxSize;
	
	public Queue(int maxSize)
	{
		list = new Object[maxSize];
		rear = -1;
		front = 0;
		this.maxSize = maxSize;
	}
	
	public boolean full()
	{
		return (rear == maxSize-1);
	}
	
	public boolean empty()
	{
		return (rear+1 == front);
	}
	
	public void insert(Object obj)          // Input to Queue
	{
		if(full()) throw new ArrayIndexOutOfBoundsException();
		list[++rear] = obj;
	}
	
	public Object peek()                  // Output array[front]'s value
	{
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		return list[front];
	}
	
	public void remove()                     // front's value ++
	{
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		front++;
	}
}