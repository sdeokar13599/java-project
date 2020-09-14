package exceptionhandling;

import java.util.Scanner;

public class HandleUserDefineException {
	int number;
	void method() 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the no  between 1 to 100");
		number = scr.nextInt();
		
		try {
			  if(number >100)
			  {
				  throw new InvalidNumberExceptionNew("Invalid Number");
			  }
			  else
			  {
				  System.out.println("number   is valid");
			  }
		 }
		catch(InvalidNumberExceptionNew e )
		{
			
			System.out.println("user defined exception handled ");
		}
		 
		 

}
}

