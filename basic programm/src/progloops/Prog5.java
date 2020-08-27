package progloops;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int i,fact=1;
		System.out.println("enter the no ");
		int num= scr.nextInt();
		
		for(i=1;i<=num;i++)
			
		{
			
			fact=fact*i;
			
		}

		System.out.println(" the factorial is "+fact);
	}

}
