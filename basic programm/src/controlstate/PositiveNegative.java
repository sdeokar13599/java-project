package controlstate;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		 Scanner scr = new Scanner(System.in);
		 System.out.println("enter the number");
		 int number=scr.nextInt();
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }

	}

}
