package controlstate;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
            	System.out.println("The addition is"+output);
                break;

            case '-':
            	output = num1 - num2;
            	System.out.println("The subtraction is "+output);
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

           
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        
    }


	}


