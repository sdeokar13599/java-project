package oopprogramms;

import java.util.Scanner;

public class Triangle extends Rectangle{
int side1,side2,side3;

Scanner scr =new Scanner(System.in);

public Triangle()
{
	
}
void area()
{System.out.println("enter the side1");
int side1=scr.nextInt();
System.out.println("enter the side2");
int side2=scr.nextInt();
System.out.println("enter the side3");
int side3=scr.nextInt();
	 int area=side1*side2*side3;
	 System.out.println("the area of triangle is "+area);
	
}
}
