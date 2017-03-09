/**
 * LinkedList를 이용한 스택 구현
 *  배열로 구현할 때보다 좋은 점: 값을 중간에 추가 / 삭제에 훨씬 용이함
 *
 */
public class LinkedStack {
	
	private Node top;
	
	class Node  //Linked List 구현을 위한 Node 객체 구현
	{
		private Object data;
		private Node nextNode;  //현재 노드와 연결된 Node 저장
		
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
