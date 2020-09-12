package controlstate;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	Scanner Scr= new Scanner(System.in);
	System.out.println("enter the year ");
	int year= Scr.nextInt();
	
	if(year%4==0) 
	{
		
		System.out.println("it is a leap year");
		
		
	}
	else
	{
		
		System.out.println("it is not a leap year");
	}
	

	}

}
