import java.util.Scanner;

public class Queue_Tester {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Input Array's size: ");
		
		int maxsize = scanner.nextInt();
		
		Queue queue = new Queue(maxsize);    // Input Array's maxSize
		
		queue.insert(3);
		queue.insert("Dog");
		queue.insert(3.14);
		
		System.out.println(queue.peek());    // Last input value print
		queue.remove();                         // top's size--
		System.out.println(queue.peek());     
		queue.remove();
		System.out.println(queue.peek());	
		queue.remove();   
		
       // Exception : ArrayIndexOutOfBoundsException / maxSize : 4 -> (front == rear+1) 
		queue.remove(); 
	}
}
