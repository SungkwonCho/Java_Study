import java.util.Scanner;

public class Stack_Tester {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Input Array's size: ");
		
		int maxsize = scanner.nextInt();
		
		Stack stack = new Stack(maxsize);    // Input Array's maxSize
		
		stack.push(3);
		stack.push("Dog");
		stack.push(3.14);
		
		System.out.println(stack.peek());    // Last input value print
		stack.pop();                         // top's size--
		System.out.println(stack.peek());     
		stack.pop();
		System.out.println(stack.peek());	
		stack.pop();        
		
      // Exception : ArrayIndexOutOfBoundsException / maxSize : 4 -> (top == -1) 
		 stack.pop();
	}
}
