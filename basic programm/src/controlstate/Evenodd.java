package controlstate;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		 int num;
		    System.out.println("Enter an Integer number:");

		    
		    Scanner scr = new Scanner(System.in);
		    num = scr.nextInt();

		    
		     
		    if ( num % 2 == 0 )
		        System.out.println("it is a number is even no");
		     else
		        System.out.println("is is a number is odd no");

	}

}
