package constructor;

import java.util.Scanner;

public class Circlemain {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Circle obj1 = new Circle();
		System.out.println("enter the value of radius");
		float radius = scr.nextFloat();
	float area =	obj1.circlearea(radius);
		System.out.println("The area is "+area);
	float circumference  =	obj1.circumference(radius);
	System.out.println("The circumference is "+circumference);
		
		

	}

}
