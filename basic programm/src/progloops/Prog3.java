package progloops;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner scr= new Scanner( System.in);
		int i=1 ;
		
		System.out.println("enter the no:");
		int num=scr.nextInt();
		
		
		while(i<=10)
			
		{
			 int result= num*i;
			System.out.println(+result);
			i++;
			
		}

	}

}
