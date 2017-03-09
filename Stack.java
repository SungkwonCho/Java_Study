/**
 * 스택 구현
 *  -> LIFO (Last In First Out)
 *  처음 들어온 값이 가장 나중에 나감.
 */
public class Stack {
	private int maxSize;
	private int top;
	private Object[] Stackarray;
	
	public Stack(int maxSize)
	{
		this.maxSize = maxSize;
		top = -1;
		Stackarray = new Object[maxSize];
	}
	
	public boolean empty()
	{
		return (top == -1);
	}
	
	public boolean full()
	{
		return (top == maxSize-1);
	}
	
	public void push(Object obj)
	{
		if(full())throw new ArrayIndexOutOfBoundsException();
		Stackarray[++top] = obj;
	}
	
	public Object peek()
	{
		if(empty())throw new ArrayIndexOutOfBoundsException();
		return Stackarray[top];
	}
	
	public Object pop()
	{
		if(empty())throw new ArrayIndexOutOfBoundsException();
		Object obj = peek();
		top--;
		return obj;
	}
}
