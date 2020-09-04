package oopprogramms;

import java.util.Scanner;

public class Square {
	int side;
	Scanner scr =new Scanner(System.in);
	
	public Square()
	{
	
		
		
	}
	
	
	void area()
	{
		System.out.println("enter the side of square");
		side=scr.nextInt();
		
		 int area=side*side;
		 System.out.println("The area of sqaure is"+area);
		
		
	}

}
