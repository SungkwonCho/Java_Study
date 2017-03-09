/**
 * Queue ����
 * -> LILO (Last In Last Out)
 *    ���� ���� ���� ���� ����
 */

public class Queue {
	private int front;  // ���� ������ �ⱸ
	private int rear;  // ���� ������ �Ա�
	private int maxSize;  // Queue �ִ� ũ��
	private Object[] Queuelist;  // Queue ����Ʈ
	
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
