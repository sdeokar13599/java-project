package progloops;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		
	Scanner scr= new Scanner(System.in);
	System.out.println(" enter the number");
	int num =  scr.nextInt();
	boolean flag=false;
	int i;
	
	for(i=2;i<=num-1;i++)
		
	{
		
		if(num%i==0)
		{
			
			flag= true;
			
		}
	}
	
	if(flag==true)
	
	{
		System.out.println(" it is not a prime no");
	}
	else
	{
		
		System.out.println(" it is prime no");
	}
	
	
	
	
	 
	
 

		

	

}
}

