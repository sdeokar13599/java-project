package controlstate;

import java.util.Scanner;

public class ProfitLoss {
	
	

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		float CP=0,SP=0,profit, loss;
         System.out.println("enter the cost price");
         CP=scr.nextFloat();
         System.out.println("enter the selling price");
        SP=scr.nextFloat();
	

		if(SP>CP)

		{

		profit=SP-CP;

		System.out.println("Profit is="+profit);

		}

		else if(CP>SP)

		{

		loss=CP-SP;

        System.out.println("Loss is="+loss);

	}
		
		else 
		{
			
			System.out.println("No profit and no loss");
		}

	}
}
