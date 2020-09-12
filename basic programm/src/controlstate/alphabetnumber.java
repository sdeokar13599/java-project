package controlstate;

import java.util.Scanner;

public class alphabetnumber {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		System.out.println("enter the character");
		int ch=scr.next().charAt(0);
		 if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
		    {
		       System.out.println("it is an alphabet");
		    }
		    else if(ch >= 48 && ch <= 57)
		    {
		        System.out.println("it is a  number");
		    }
		    else 
		    {
		        System.out.println("it is a special character ");
		    }


	}

}
