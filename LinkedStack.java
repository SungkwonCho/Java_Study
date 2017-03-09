/**
 * LinkedList�� �̿��� ���� ����
 *  �迭�� ������ ������ ���� ��: ���� �߰��� �߰� / ������ �ξ� ������
 *
 */
public class LinkedStack {
	
	private Node top;
	
	class Node  //Linked List ������ ���� Node ��ü ����
	{
		private Object data;
		private Node nextNode;  //���� ���� ����� Node ����
		
		public Node(Object data)
		{
			this.data = data;
			nextNode = null;
		}
	}
	
	public LinkedStack()
	{
		top = null;
	}
	
	public boolean empty()
	{
		return (top == null);
	}
	
	public void push(Object data)
	{
		Node node = new Node(data);
		node.nextNode = top;
		top = node;
	}
	
	public Object peek()
	{
		return top.data;
	}
	
	public Object pop()
	{
		if(empty())throw new ArrayIndexOutOfBoundsException();
		Object data = peek();
		top = top.nextNode;
		return data;
	}
}
