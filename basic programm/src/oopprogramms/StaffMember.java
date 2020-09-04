package oopprogramms;

import java.util.Scanner;

public class StaffMember extends Department {
String MemberName,MemberQualification;
Scanner scr =new Scanner(System.in);

StaffMember()
{
	
	System.out.println("enter member name ");
	MemberName=scr.next();
	System.out.println("enter member qualification ");
	MemberQualification=scr.next();
	
	
}

 void showstaffMemberDetails() 
{
	
	System.out.println("the member name is"+MemberName);
	System.out.println("the member qualification is"+MemberQualification);
	
}

}
