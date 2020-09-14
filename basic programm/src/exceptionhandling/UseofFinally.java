package exceptionhandling;

import java.util.Scanner;

public class UseofFinally {
	
	      void finallydemo()
	      {
	    	  Scanner Scr = new Scanner(System.in);
	    	  Scanner sc = new Scanner(System.in);
	  		
	  		System.out.println("Enter a number: ");
	  		int num1 = sc.nextInt();
	  		
	  		System.out.println("Enter 2nd number: ");
	  		int num2 = sc.nextInt();
	  		
	  		int result=0;
	  		try {
	  		result=num1/num2;
	      }
	  		finally
	  		{
	  			System.out.println("this is  demo of finally ");
	  			
	  		}

	      }
}
