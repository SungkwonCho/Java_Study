public class Main {

	public static void main(String[] args)
	{
		InsertSorting insert = new InsertSorting();
		Comparable[] student = new Student[3];
		
		student[2] = new Student("������",12);
		student[1] = new Student("������",11);
		student[0] = new Student("������",33);
		
		insert.sorting(student);
		
		for(Comparable std:student)
		{
			System.out.println(std);
		}
		
		System.out.println();
		
		SelectSorting select = new SelectSorting();
		Comparable[] card = new Card[3];
		
		card[0] = new Card("������",2020);
		card[1] = new Card("�̹���",0103);
		card[2] = new Card("���α�",4033);
		
		select.Sorting(card);
		
		for(Comparable c: card)
		{
			System.out.println(c);
		}
		
		System.out.println();
		
		Queue queue = new Queue(3);
		queue.insert("123");
		queue.insert("������");
		queue.insert(12345);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		System.out.println();
		
		Stack stack = new Stack(3);
		stack.push(12);
		stack.push(3);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println();
		
		LinkedStack link = new LinkedStack();
		
		link.push(333);
		link.push(13);
		link.push("����");
		
		System.out.println(link.pop());
		System.out.println(link.pop());
		System.out.println(link.pop());
	}
}
