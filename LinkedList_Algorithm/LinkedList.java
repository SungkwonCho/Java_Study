public class LinkedList {
	
	private Node headNode;
	private int size;
	
	public LinkedList()
	{
		size = 0;
		headNode = new Node(null);
	}
	
	class Node
	{
		private Object data;
		private Node nextNode;
		
		public Node(Object data)
		{
			this.data = data;
			this.nextNode = null;
		}
	}
	
	public Object get(int index)   // Find Object through index
	{
		return getNode(index).data;
	}
	
	public Node getNode(int index)
	{
		if(index<0 || index>=size) throw new IndexOutOfBoundsException();
		
		Node node = headNode.nextNode;
		for(int i=0; i<index; i++)
		{
			node = node.nextNode;
		}
		return node;
	}
	
	public Object getFirst()
	{
		return get(0);
	}
	
	public int getNodeIndex(Object obj)
	{
		if(size<=0)
			return -1;
		
		int index = 0;                        // return value
		Node node = headNode.nextNode;
		Object data = node.data;
		
		while(!data.equals(obj))
		{
			node = node.nextNode;

			if(node == null)
				return -1;
			
			data = node.data;
			index++;
		}
		return index;
	}
	
	public void addFirst(Object data)          // Insert "Node(data)" to first Node
	{
		Node node = new Node(data);
		node.nextNode = headNode.nextNode;
		headNode.nextNode = node;
		size++;
	}
	
	public void add(int index, Object data)   //Insert Node(data) to index
	{
		if(index == 0)
		{
			addFirst(data);
			return ;
		}
		
		Node node = new Node(data);

		Node previousNode = getNode(index-1);
		Node next = previousNode.nextNode;
		
		previousNode.nextNode = node;
		node.nextNode = next;
		size++;
	}
	
	public void addLast(Object data)
	{
		add(size,data);
	}
	
	public void add(Object data)
	{
		addLast(data);
	}
	
	public Object removeFirst()
	{
		Node node = getNode(0);
		headNode.nextNode = node.nextNode;
		size--;
		return node.data;
	}
	
	public Object remove(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0)
			return removeFirst();
		else
		{
			Node previousNode = getNode(index-1);
			Node removeNode = previousNode.nextNode;
			Node next = removeNode.nextNode;
			previousNode.nextNode = next;
			size--;
			
			return next.data;
		}
	}
	
	public boolean remove(Object data)
	{
		int index = getNodeIndex(data);
		if(index == -1)
		{
			return false;
		}
		else
			remove(index);
			return true;
	}
	
	public Object removeLast()
	{
		return remove(size-1);
	}
	
	public int size()
	{
		return size;
	}
	
	@Override
	public String toString()
	{
		StringBuffer result = new StringBuffer("[");
		
		Node node = headNode.nextNode;
		
		if(node != null)
		{
			result.append(node.data);
			node = node.nextNode;
			while(node != null)
			{
				result.append(", ");
				result.append(node.data);
				node = node.nextNode;
			}
		}
		
		result.append("]");
		return result.toString();
	}
}
