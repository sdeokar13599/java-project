package oopprogramms;

import java.util.Scanner;

public class Manager extends Worker {
	String Department;
Scanner scr =new Scanner(System.in);
	void managerinput()
	{
		
		System.out.println("enter the department");
		Department = scr.next();
		
	}
	
	void managerdisplay()
	{
		
		System.out.println("The department of manager is "+Department);
		
			 System.out.println("the name is "+Sname);
			 System.out.println("the Address is "+Saddress);
			 System.out.println("the age is "+Sage);
			 System.out.println("the phone no  is "+sphonenumber);
			 
			 System.out.println("the salary is "+ssalary);
		 }
			 
		
	}

