package oopprogramms;

import java.util.Scanner;

public class TrainersActivity {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		long Id;
		String phone, Name, Addres;
		double salary=0.0;
		 
		 System.out.println("enter the Employee id");
		  Id=scr.nextLong();
		  System.out.println("enter the Employee name");
		  Name=scr.next();
		  System.out.println("enter the Employee address");
		  Addres=scr.next();
		  System.out.println("enter the Employee phone");
		  phone=scr.next();
		  
		  
		  new Employees(Id,phone,Name,Addres);
		  Managers obj1=new Managers(Id,phone,Name,Addres,salary);
		  obj1.calculateSalary();
		 
		 
		

	}

}
