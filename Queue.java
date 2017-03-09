/**
 * Queue 구현
 * -> LILO (Last In Last Out)
 *    먼저 들어온 값이 먼저 나감
 */

public class Queue {
	private int front;  // 값이 나가는 출구
	private int rear;  // 값이 들어오는 입구
	private int maxSize;  // Queue 최대 크기
	private Object[] Queuelist;  // Queue 리스트
	
	public Queue(int maxSize)
	{
		this.maxSize = maxSize;
		front = 0;
		rear = -1;
		Queuelist = new Object[maxSize];
	}

	public boolean empty()
	{
		return (rear+1 == front);
	}
	
	public boolean full()
	{
		return (rear == maxSize-1);
	}
	
	public void insert(Object obj)
	{
		if(full())throw new ArrayIndexOutOfBoundsException();
		Queuelist[++rear] = obj;
	}
	
	public Object peek() 
	{
		if(empty())throw new ArrayIndexOutOfBoundsException();
		return Queuelist[front];
	}
	
	public Object remove()
	{
		if(empty())throw new ArrayIndexOutOfBoundsException();
		Object obj = peek();
		front++;
		return obj;
	}
}
