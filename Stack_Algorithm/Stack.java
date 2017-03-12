import java.util.ArrayList;

public class Stack {
	
	private Object[] list;
	private int top;
	private int maxSize;
	
	public Stack(int maxSize)
	{
		list = new Object[maxSize];
		top = -1;
		this.maxSize = maxSize;
	}
	
	public boolean full()
	{
		return (top == maxSize-1);
	}
	
	public boolean empty()
	{
		return (top == -1);
	}
	
	public void push(Object obj)          // Input to Stack
	{
		if(full()) throw new ArrayIndexOutOfBoundsException();
		list[++top] = obj;
	}
	
	public Object peek()                  // Output array[top]'s value
	{
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		return list[top];
	}
	
	public void pop()                     // top's value --
	{
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		--top;
	}
}
