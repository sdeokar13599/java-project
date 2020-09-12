package controlstate;

import java.util.Scanner;

public class Upperlower {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		System.out.println("enter the character");
		int ch=scr.next().charAt(0);
		 if(ch >= 65 && ch <= 90) 
		    {
		       System.out.println("it is a uppercase ");
		    }
		    else if(ch >= 97 && ch <= 122)
		    {
		        System.out.println("it is a  lowercase");
		    }

	}

}
