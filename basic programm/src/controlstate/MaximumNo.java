package controlstate;

import java.util.Scanner;

public class MaximumNo {

	public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the first number:");

        num1 = scr.nextInt();

        System.out.print("Enter the second number:");

        num2 = scr.nextInt();

        System.out.print("Enter the third number:");

        num3= scr.nextInt();

        if(num1 > num2 && num1>num3)

        {

            System.out.println("Largest number is:"+num1);

        }

        else if(num2>num1&&num2>num3)

        {

            System.out.println("Largest number is:"+num2);

        }

        else

        {

            System.out.println("Largest number is:"+num3);

        }

 

	}

}
