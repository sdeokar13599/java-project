package exceptionhandling;

import java.util.Scanner;

public class GenerateAnException   {
	int number;
	
	
	void method() throws InvalidNumberException
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the no  between 1 to 100");
		number = scr.nextInt();
		
		
			  if(number >100)
			  {
				  throw new InvalidNumberException("Invalid Number ");
			  }
			  else
			  {
				  System.out.println("number   is valid");
			  }
		 }
		 
		 
		
	
		
		
	

	}

