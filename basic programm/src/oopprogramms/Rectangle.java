package oopprogramms;

import java.util.Scanner;

public class Rectangle extends Square {
int length,breadth;
Scanner scr =new Scanner(System.in);


public Rectangle()
{
	
}

void arae()
{

	System.out.println("enter the length and breadth");
	length=scr.nextInt();
	breadth=scr.nextInt();

	 int area=length*breadth;
	 System.out.println("the area of rectangle is "+area);
	
	
}
}
