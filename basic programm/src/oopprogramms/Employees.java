package oopprogramms;

import java.util.Scanner;

public class Employees {
	Scanner scr =new Scanner(System.in);
Long	employeeId;
 String employeeName,employeeAddress,employeePhone;
 Double basicSalary,specialAllowance=250.80,Hra=1000.50;
 
 
 Employees(long Id,String phone, String Name,String Addres)
		
 {
	
	 employeeId=Id;
	
	 employeePhone=phone;
	
	 employeeName=Name;
	
	 employeeAddress=Addres;
	 
 }
	 void calculateSalary()
	 {
		 System.out.println("enter the basic salary");
		 basicSalary=scr.nextDouble();
		 Double salary= basicSalary+(basicSalary+ 250.80/100)+(basicSalary*1000.50/100);
		System.out.println("the salary is="+salary);
	 }
	 
	 void calculateTransportAllowance()
	 {
		 
		 
		 Double  transportAllowance = 10/100*basicSalary;
		 System.out.println("The Transport allowance is "+transportAllowance);
			
		
	 }
	 
 
   void displayDetails()                                                                  
   {
	   System.out.println("The employee id is "+employeeId);
	   System.out.println("The employee phoneis "+employeePhone);
	   System.out.println("The employee name is"+employeeName);
	   System.out.println("The employee address is" +employeeAddress);
	   
	   
	   
   }
}		 

 







