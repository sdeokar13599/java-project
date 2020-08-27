package progloops;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the no");
		int num= scr.nextInt();
		int count=0;
		
		while(num!=0)
		{
		
		num=num/10;
		count++;
		
		
	}
System.out.println("the no of digit is "+count);
}
}
