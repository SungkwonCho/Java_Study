/*
 * problem. 3
 * 
 *   1. Input number 
 *         -> 2. Find input number's divisor
 *               -> 3. Distinction of Input data == prime number
 *                       -> 4. Print Max prime number
 */ 

import java.util.Scanner;


public class Problem3 {
	
	public static boolean isPrime(int input)     // 3. Distinction of Input data == prime number
	{
		if(input == 2)
			return true;
		else
			{
	         	for(int i=2; i<=(int)Math.sqrt(input); i++)
	         		{
	         			if(input % i == 0)    
					    return false;
	         		}
	         	return true;
			}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int result = 0;                                 // result = Max prime number
		
		System.out.print("Input number: (num>0)");                //  1. Input number
	
		int input = scanner.nextInt();
		
		for(int i = 1; i<=input; i++)
		{
			if(input % i == 0)           // 2. Find input number's divisor
			{
				if(isPrime(i))
					result = i;
			}
		}
		
		System.out.println("max prime factor: "+result);   // 4. Print Max prime number
		return ;
	}
}
