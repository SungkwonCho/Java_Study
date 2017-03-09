public class Main {

	public static void main(String[] args)
	{
		InsertSorting insert = new InsertSorting();  //삽입정렬 출력
		Comparable[] student = new Student[3];
		
		student[2] = new Student("강지수",12);  //이름 순 & 이름이 같을 시, 번호를 통해 정렬
		student[1] = new Student("강지수",11);
		student[0] = new Student("조성권",33);
		
		insert.sorting(student);
		
		for(Comparable std:student)
		{
			System.out.println(std);
		}
		
		System.out.println();
   ///////////////////////////////////////////////////////////////////////////////
		
		SelectSorting select = new SelectSorting();  // 선택정렬 출력
		Comparable[] card = new Card[3];
		
		card[0] = new Card("ChoSungkwon",333);  //삽입정렬과 동일 정렬
		card[1] = new Card("LeeSohyun",222);
		card[2] = new Card("Chominkwon",111);
		
		select.Sorting(card);
		
		for(Comparable c: card)
		{
			System.out.println(c);
		}
		
		System.out.println();
	///////////////////////////////////////////////////////////////////////////
		
		Queue queue = new Queue(3);   //Queue 구현
		queue.insert("123");
		queue.insert("조성권");
		queue.insert(12345);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		System.out.println();
	/////////////////////////////////////////////////////////////////////////
		
		Stack stack = new Stack(3);  //Stack 구현
		stack.push(12);
		stack.push(3);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println();
	/////////////////////////////////////////////////////////////////////////
		
		LinkedStack link = new LinkedStack();
		
		link.push(333);
		link.push(13);
		link.push("성권");
		
		System.out.println(link.pop());
		System.out.println(link.pop());
		System.out.println(link.pop());
	}
}
