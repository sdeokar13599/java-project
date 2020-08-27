package progloops;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the num1 in the range");
		int num1=scr.nextInt();
		System.out.println("enter the num2 in the range ");
		int num2=scr.nextInt();
		
		System.out.println("the even no in the given range are ");
		
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				
				System.out.println(+i);
			}
			
		}
		
		System.out.println("the odd numbers in the range  ");
		for(int i=num1;i<=num2;i++)
		{
			
			if(i%2!=0)
			{
				System.out.println(+i);
				
			}
				
		}
		
		

	}

}
