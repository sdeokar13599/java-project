package exceptionhandling;

import java.util.Scanner;

public class RuntimeStackhandle {

	
	void method1()
	{
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		int result=0;
		try {
		result=num1/num2;
		
		}
		
		catch (ArithmeticException e)
		{
			
			System.out.println("exception handled ");
	
	}
		
		System.out.println("result is "+result);
	
	}
		void method2()
		{
			
			method1();
			
		}
		
		void method3()
		{
			
			method2();
			
		}
		
		
		
		void method4() 
		
		{
			
			method3();
			
			
			
			
		}
			
			
		
	
		
	

}


