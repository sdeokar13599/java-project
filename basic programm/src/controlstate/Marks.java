package controlstate;

import java.util.Scanner;

public class Marks {
	
	

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		

		
		System.out.println("enter the marks of phyics");
		int phy=scr.nextInt();
		System.out.println("enter the marks of maths");
		int math=scr.nextInt();
		System.out.println("enter the marks of chem");
		int che=scr.nextInt();
		System.out.println("enter the marks of english");
		int eng=scr.nextInt();
		System.out.println("enter the marks of marathi");
		int mar=scr.nextInt();
		
		float  sum=phy+math+che+eng+mar;
		float  percentage=sum/500*100;
		
		System.out.println("the sum of marks is "+sum);
		System.out.println("the percentage is "+percentage);
		
		
		if(percentage>=90)
		{
			
			System.out.println("you have got A grade");
		}
		else if(percentage>=80)
		{
			
			System.out.println("you have got B grade");
		}
		
		else if(percentage>=70)
		{
			
			System.out.println("you have got C grade");
		}
		else if(percentage>=60)
		{
			
			System.out.println("you have got D grade");
		}
		else if(percentage>=40)
		{
			
			System.out.println("you have got E grade");
		}
		
		else 
		{
			
			System.out.println("you have got F grade");
		}
	

	}

}
