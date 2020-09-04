package oopprogramms;

import java.util.Scanner;

public class Department {
String	departmentName,HODname;
Scanner scr =new Scanner(System.in);

Department()
{
	System.out.println("enter the department name");
	departmentName=scr.next();
	System.out.println("enter the Hod name");
	HODname=scr.next();	
	
	
}

 void showDepartmentDetails() 
{
	
	System.out.println("The departname is "+departmentName);
	System.out.println("The Hod name is "+HODname);
}


}
