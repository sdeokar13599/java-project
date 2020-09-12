package controlstate;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		System.out.println("enter the size of  side1 ");
		int side1=scr.nextInt();
		System.out.println("enter the size of side2 ");
		int side2=scr.nextInt();
		System.out.println("enter the  size of side3");
		int side3=scr.nextInt();
		
		if(side1==side2&&side1==side3)
		{
			
			System.out.println("it is equilateral triangle");
		}
		else if(side1==side2||side2==side3)
		{
			
			System.out.println("it is a isosceles triangle");
		}
		
		else
		{
			
			System.out.println("it is scalene triangle");
		}
		
		

	}

}
