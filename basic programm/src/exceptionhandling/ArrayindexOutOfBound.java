package exceptionhandling;

import java.util.Scanner;

public class ArrayindexOutOfBound {
	
		
		void method1()
		{
			
			int array1[] = new int[5];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter elements of array-- ");
			
			for(int i=0;i<5;i++)
			{
				array1[i] = sc.nextInt();
			}
			
			System.out.println("Elements entered are-- ");
			for(int i=0;i<5;i++)
			{
				System.out.println("element is -- "+array1[i]);
			}
			
			
			
			try
			{
				
				
				System.out.println(array1[6]);  
			}
			
		
			catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("exception handled ");
			}
		
		
		
	}
	
	
}
