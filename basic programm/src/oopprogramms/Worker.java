package oopprogramms;

import java.util.Scanner;

public class Worker {
	 int  Sage,ssalary;
	 String Sname,Saddress;
	long sphonenumber;
	 Scanner scr = new Scanner(System.in);
	 
	 
	 void displaysalry()
	 {
		 System.out.println("enter the  name :");
		 Sname = scr.next();
		 System.out.println("enter the  Address:");
		 Saddress = scr.next();
		 System.out.println("enter the  age :");
		 Sage = scr.nextInt();
		 System.out.println("enter the  phone no :");
		 sphonenumber = scr.nextLong();
		 System.out.println("enter the  salary :");
		 ssalary = scr.nextInt();

		 
	 }
	 
	
}
