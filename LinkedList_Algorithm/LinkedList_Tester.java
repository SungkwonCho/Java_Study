public class LinkedList_Tester {
	
	public static void main(String[] args)
	{
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.add("Devil");
		linkedlist.add(123);
		linkedlist.add(3.41);
		linkedlist.add(1,"Angel");
		linkedlist.addFirst("FIRST");
		linkedlist.add(999);
		
		System.out.println(linkedlist);
	}
}
